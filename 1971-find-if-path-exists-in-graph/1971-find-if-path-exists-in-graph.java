class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (graph.containsKey(u)) {
                graph.get(u).add(v);
            } else {
                Set<Integer> neighbors = new HashSet<>();
                neighbors.add(v);
                graph.put(u, neighbors);
            }
            if (graph.containsKey(v)) {
                graph.get(v).add(u);
            } else {
                Set<Integer> neighbors = new HashSet<>();
                neighbors.add(u);
                graph.put(v, neighbors);
            }
        }
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(source);
        visited.add(source);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            if (vertex == destination) {
                return true;
            }
            for (int neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }
}