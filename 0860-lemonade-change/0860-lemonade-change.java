class LemonadeStand {
    private int fives = 0;
    private int tens = 0;

    public boolean canProvideChange(int[] customerBills) {
        for (int bill : customerBills) {
            if (!processTransaction(bill)) {
                return false;
            }
        }
        return true;
    }

    private boolean processTransaction(int bill) {
        switch (bill) {
            case 5:
                fives++;
                return true;
            case 10:
                if (fives == 0) return false;
                fives--;
                tens++;
                return true;
            case 20:
                return provideChangeFor20();
            default:
                throw new IllegalArgumentException("Invalid bill: " + bill);
        }
    }

    private boolean provideChangeFor20() {
        if (tens > 0 && fives > 0) {
            tens--;
            fives--;
        } else if (fives >= 3) {
            fives -= 3;
        } else {
            return false;
        }
        return true;
    }
}


class Solution {
    public boolean lemonadeChange(int[] bills) {
        return new LemonadeStand().canProvideChange(bills);
    }
}