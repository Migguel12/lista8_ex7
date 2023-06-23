public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Tamaguchi t1 = new Tamaguchi();

        t1.alterarNome("Carlos");
        t1.alterarFome(10);
        t1.alterarSaude(5);
        t1.alterarIdade(12);

        System.out.print (t1.mostrarHumor());


    }
}
