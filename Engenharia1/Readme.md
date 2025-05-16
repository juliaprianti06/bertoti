What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.

# Atividade 1
No texto lido, é retratado sobre a profissão engenheiro de software. Há muitas áreas na engenharia, entretanto, a engenharia de software é nova no mercado, o que ocasiona confusão sobre o que é e a diferença entre outras profissões. 
Um engenheiro de software trabalha com coisas intangíveis, ou seja, é algo lógico e calculado. Erros causados na engenharia de software não causam tanto impacto como podem ser causadas em outras engenharias.
Contudo, a engenharia de software se encontra cada vez mais presente no cotidiano da sociedade.


Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
 
One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
 
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
 
Time and Change
How code will need to adapt over the length of its life
 
Scale and Growth
How an organization will need to adapt as it evolves
 
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth
# Atividade 2
No livro Programming Over Time, retrata sobre como é o processor de desenvolver um código e como as organizações e seus programadores mantém um código limpo e compreendível. O livro cita 3 principios fundamentais que empresas devem manter para melhor aproveitamento, são eles: Tempo e mudança, escala e crescimento, compensação e custos.


# Atividade 3
Exemplos de trade-off:
1. Java vs Python - Python é mais lento porém com uma linguagem mais simples, Java é uma linguagem universal podendo ser utlizado em qualquer plataforma ou sistema operacional porém com regras de sintáticas mais complexas.
2. Windows vs Linux - Linux possui mais segurança e privacidade, entretanto há uma instalação mais complexa, Windows tem mais opções a serem instaladas porém é um produto com código fechado.
3. Banco 2000 vs Banco 2010 - Banco 2000 era mais simples porém com menos escala, Banco 2010 possui mais escalabilidade entretanto com mais custos. 

# Atividade 4
Comentário da imagem do slide:
Na imagem vemos um exemplo de MVP, para uma primeira entrega é necessário o mínimo produto viável(MVP), entretanto tem que ser algo funcional, que já ajude o cliente a utilizar o produto, mesmo que não seja o produto final.

# Atividade 5

```java
package cadastro_cliente;

public class Cadastro_cliente {
    private int id;
    private String nome;
    private String email;

    public Cadastro_cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getid() {
        return id;
    }

    public String getnome() {
        return nome;
    }

    public String getemail() {
        return email;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Email: " + email;
    }
}

package cadastro_cliente;

import java.util.List;
import java.util.LinkedList;

public class Loja {
    private List<Cadastro_cliente> cadastro_Clientes = new LinkedList<Cadastro_cliente>();

    public void addCadastro_cliente(Cadastro_cliente novoCadastro) {
        cadastro_Clientes.add(novoCadastro);
    }

    public Cadastro_cliente buscarID(int id) {
        for (Cadastro_cliente cliente : cadastro_Clientes) {
            if (cliente.getid() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cadastro_cliente> buscarNome(String nome) {
        List<Cadastro_cliente> encontrados = new LinkedList<Cadastro_cliente>();
        for (Cadastro_cliente Cadastro_cliente : cadastro_Clientes) {
            if (Cadastro_cliente.getnome().equals(nome))
                encontrados.add(Cadastro_cliente);
        }
        return encontrados;
    }

    public List<Cadastro_cliente> getCadastro_cliente() {
        return cadastro_Clientes;
    }
}
package cadastro_cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Cadastro_cliente cliente1 = new Cadastro_cliente(1, "João", "joao@gmail.com");
        Cadastro_cliente cliente2 = new Cadastro_cliente(2, "Maria", "maria@gmail.com");

        loja.addCadastro_cliente(cliente1);
        loja.addCadastro_cliente(cliente2);

        Cadastro_cliente clienteBuscadoID = loja.buscarID(1);
        if (clienteBuscadoID != null) {
            System.out.println("Cliente encontrado pelo ID: " + clienteBuscadoID);
        } else {
            System.out.println("Cliente não encontrado pelo ID.");
        }

        List<Cadastro_cliente> clientesEncontrados = loja.buscarNome("João");
        System.out.println("Clientes encontrados pelo nome 'João':");
        for (Cadastro_cliente cliente : clientesEncontrados) {
            System.out.println(cliente);
        }
    }
}

