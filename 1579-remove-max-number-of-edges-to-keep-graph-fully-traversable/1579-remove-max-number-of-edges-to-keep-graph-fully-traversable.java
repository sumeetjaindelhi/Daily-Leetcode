class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> b[0] - a[0]);

        DSU dsuAlice = new DSU(n + 1);
        DSU dsuBob = new DSU(n + 1);

        int removedEdges = 0, aliceEdges = 0, bobEdges = 0;

        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (dsuAlice.union(edge[1], edge[2])) {
                    dsuBob.union(edge[1], edge[2]);
                    aliceEdges++;
                    bobEdges++;
                } else {
                    removedEdges++;
                }
            } else if (edge[0] == 2) {
                if (dsuBob.union(edge[1], edge[2])) {
                    bobEdges++;
                } else {
                    removedEdges++;
                }
            } else {
                if (dsuAlice.union(edge[1], edge[2])) {
                    aliceEdges++;
                } else {
                    removedEdges++;
                }
            }
        }

        if (aliceEdges == n - 1 && bobEdges == n - 1) {
            return removedEdges;
        } else {
            return -1;
        }
    }
}

class DSU {
    int[] parent, rank;

    DSU(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);
        if (xRoot != yRoot) {
            if (rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;
            } else if (rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot;
            } else {
                parent[yRoot] = xRoot;
                rank[xRoot]++;
            }
            return true;
        }
        return false;
    }
}