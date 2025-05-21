public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int chickenCount = 3;
        int eggsPerChicken = 8;
        int totalEggs = 0;

            totalEggs += (chickenCount * eggsPerChicken);
            totalEggs += (++chickenCount) * eggsPerChicken;
            totalEggs += (chickenCount/2) * eggsPerChicken;

        System.out.println(totalEggs);
    }   
}
