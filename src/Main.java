public class Main {
    public static void main(String[] args) {
        int start = 100;
        int add = 1700;
        int point = 100;
        int bonus = add / point;
        int cash = start + add;
        int limit = 1000;
        if (add >= limit) {
            cash = start + add + bonus;
        }
        System.out.println(cash);
    }
}
