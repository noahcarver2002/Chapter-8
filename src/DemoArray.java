public class DemoArray {
    public static void main(String[] args){

        double[] salaries = new double[4];
        salaries[0] = 6.25;
        salaries[1] = 6.55;
        salaries[2] = 10.25;
        salaries[3] = 16.85;

        System.out.print("salaries printed onj by one are;");
        System.out.print(salaries[0]);
        System.out.print(salaries[1]);
        System.out.print(salaries[2]);
        System.out.print(salaries[3]);

        displayFor(salaries);

    }
    public static void displayFor(double[] salaries){
        for(int i = 0; i < salaries.length; i++){
            System.out.println(salaries[i]);
        }
        for (int j = salaries.length; j >= 0; j--){
            System.out.println(salaries[j]);
        }
    }

}
