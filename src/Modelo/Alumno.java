package Modelo;

public class Alumno {
    private int matricula;
    private String nombre;
    private String apellidos;
    private int[] notas;
    private double media;



    public Alumno(int matricula, String nombre, String apellidos, int[] notas) {
        this.matricula = matricula; // 4 byte
        this.nombre = longitudMax(nombre,30); // 60 byte
        this.apellidos = longitudMax(apellidos,60); // 120 byte
        this.notas = notas; // 16 byte
        this.media = calcularMedia(); // 8 byte
        //Total 208 byte
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    private double calcularMedia() {
        double media = 0;
        for (int i = 0; i < notas.length; i++){
            media =+ notas[i];
        }
        return media/notas.length;
    }

    private String longitudMax(String texto, int tamanio){
        StringBuffer sb = new StringBuffer();
        sb.append(texto);
        sb.setLength(tamanio);
        return sb.toString();
    }
}
