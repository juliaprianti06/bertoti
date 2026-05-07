package antipadrao;

public class Placar {
    private String time;
    private int pontos;

    public void marcarPonto(String time, int pontos) {
        this.time = time;
        this.pontos = pontos;

        System.out.println("TELÃO: " + time + " marcou! Total: " + pontos);
        System.out.println("PUSH APP: Goool do " + time + "! Placar: " + pontos);
        System.out.println("RÁDIO: E é goool do " + time + ", pontuação agora é " + pontos);
    } 
}
