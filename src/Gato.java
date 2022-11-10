public class Gato {
    public static void main(String[] args) {
        System.out.println("Hola gatos del mundo");}

    private String nombre;

    private String raza;

    private String color;

    private String numChip;

    private int edad;

    Gato(String no , String ra , String co , String nc , int ed){

        this.nombre = no;
        this.raza = ra;
        this.color = co;
        this.numChip = nc;
        this.edad = ed;

    }

    public String getNombre() {
        return nombre;
    }
}
