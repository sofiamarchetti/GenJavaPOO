package POO;

public class TestaCliente {

    public static void main(String[] args) {

            ClasseCliente[] lista = new ClasseCliente[6];

            lista[0] = new ClasseCliente("Cinthia", "14.05.1987", "roxo", 36, 1.60);
            lista[1] = new ClasseCliente("JoÃ£o", "14.05.1988", "verde", 35, 1.73);
            lista[2] = new PessoaFisica("Sofia", "15.05.1988", "amarelo", 35, 1.83,"0123456459", "internet");
            lista[3] = new PessoaFisica("Kelly", "25.05.1988", "rosa", 35, 1.50,"0123454559", "amigo");
            lista[4] = new PessoaJuridica("Deborah", "14.05.1988", "roxo", 35, 1.62,"12345678912345", "Aprendendo Java Juntos");
            lista[5] = new PessoaJuridica("Ricardo", "07.05.1988", "preto", 35, 1.82,"98745632145698", "Todo mundo fazendo juntos");

            for(ClasseCliente roda:lista) {
                roda.imprimirInfo();
            }
            System.out.println("\n**");
        }
    }
