public class PlanoOperadora {
    public static void main(String[] args) {
/*
        String plano = "M"; // M / T   

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb Youtube");
        }
*/
        String plano = "B"; // M / T   
        // String plano = "T"; // M / T   

        switch (plano) {
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "T": {
                System.out.println("5Gb Youtube");
            }
        }
    }
}
