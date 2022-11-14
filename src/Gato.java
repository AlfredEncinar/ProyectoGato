public class Gato {
    public static void main(String[] args) {
        System.out.println("Hola gatos del mundo");}

    private String nombre;

    private String raza;

    private String color;

    private String pelo;

    private String numChip;

    private int edad;

    Gato(String no , String ra , String co , String p ,String nc , int ed){

        this.nombre = no;
        this.raza = ra;
        this.color = co;
        this.pelo = p;
        this.numChip = nc;
        this.edad = ed;

    }

    public String toString(){

        String salida;

        salida = String.format("nombre : %s\nraza : %s\ncolor : %s\npelo : %s\nnúmero de chip : %s\nedad : %s años " ,nombre,raza,color,pelo,numChip,edad);
/*        salida = "Este es el libro titulado " + this.titulo;
        salida += ", el autor es " + this.autor;*/

        return salida;

    }

}
