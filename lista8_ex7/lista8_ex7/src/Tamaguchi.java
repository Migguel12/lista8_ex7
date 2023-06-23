public class Tamaguchi {
    String nome;
    int fome;
    int saude;
    int idade;

    public void alterarNome(String novoNome){
        nome = novoNome;
    }

    public String mostrarNome(){
        return nome;
    }

    public void alterarFome(int novaFome){
        fome = novaFome;
    }
    
    public int mostrarFome(){
        return fome;
    }

    public void alterarSaude(int novaSaude){
        saude = novaSaude;
    }

    public int mostrarSaude(){
        return saude;
    }

    public void alterarIdade(int novaIdade){
        idade = novaIdade;
    }

    public int mostrarIdade(){
        return idade;
    }

    public String mostrarHumor(){
        int humor = (fome + saude) / 2;
        if(humor >= 10){
            return "Feliz!";
        }
        else if(humor >=5 && humor < 10){
            return "Normal";
        }
        else{
            return "Triste!";
        }
    }

    
}
