public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura (5 como mínimo): "));
        int espaciosIntroducidos = Integer.parseInt(System.console().readLine("Introduzca el número de espacios entre los números (1 como mínimo): "));

        for(int i = 1; i <= altura; i++){
            if(i % 2 != 0 && i <= 3)
                System.out.printf("*%"+espaciosIntroducidos+"s****%"+espaciosIntroducidos+"s****%n", " ", " ");
                else if(i % 2 == 0 && i <= 3)
                        System.out.printf("*%"+espaciosIntroducidos+"s*   %"+espaciosIntroducidos+"s*%n", " ", " ");
                        else if(i == 4){
                            for(int j = 0; j < altura - 4; j++){
                                System.out.printf("*%"+espaciosIntroducidos+"s   *%"+espaciosIntroducidos+"s   *%n", " ", " ");
                            }
                        }
            if(i == altura){
                System.out.printf("*%"+espaciosIntroducidos+"s****%"+espaciosIntroducidos+"s****%n", " ", " "); 
            }
        }
    }
}
