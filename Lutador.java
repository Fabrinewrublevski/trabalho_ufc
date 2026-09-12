public class Lutador {

    // Atributos do lutador
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;

    // Método para apresentar os dados do lutador
    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Categoria: " + categoria);
        System.out.println("Vitórias: " + vitoria);
        System.out.println("Derrotas: " + derrota);
        System.out.println("Empates: " + empate);
    }

    // Método para mostrar o status do lutador
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Vitórias: " + vitoria);
        System.out.println("Derrotas: " + derrota);
        System.out.println("Empates: " + empate);
    }

    // Adiciona uma vitória
    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    // Adiciona uma derrota
    public void perderLuta() {
        this.setDerrota(this.getDerrota() + 1);
    }

    // Adiciona um empate
    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }

    // Construtor
    public Lutador(String no, String na, int id, float al,
                   float pe, int vi, int de, int em) {

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;

        // O setPeso também calcula a categoria
        this.setPeso(pe);

        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }

    // Getter e Setter do nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter da nacionalidade
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    // Getter e Setter da idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter e Setter da altura
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Getter e Setter do peso
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;

        // Sempre que o peso mudar, a categoria é atualizada
        this.setCategoria();
    }

    // Getter da categoria
    public String getCategoria() {
        return categoria;
    }

    // Calcula a categoria de acordo com o peso
    public void setCategoria() {

        if (this.peso < 52.2) {
            this.categoria = "inválido";

        } else if (this.peso <= 70.3) {
            this.categoria = "leve";

        } else if (this.peso <= 83.9) {
            this.categoria = "médio";

        } else if (this.peso <= 120.2) {
            this.categoria = "pesado";

        } else {
            this.categoria = "inválido";
        }
    }

    // Getter e Setter das vitórias
    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    // Getter e Setter das derrotas
    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    // Getter e Setter dos empates
    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}