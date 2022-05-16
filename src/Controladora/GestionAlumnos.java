package Controladora;

import Modelo.Alumno;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class GestionAlumnos {
    private static final String FICHERO = "Alumnos.dat";

    public void aniadirAlumno(Alumno alumno){
        try (RandomAccessFile raf = new RandomAccessFile(FICHERO,"rw")){
            raf.writeInt(alumno.getMatricula());
            raf.writeUTF(alumno.getNombre());
            raf.writeUTF(alumno.getApellidos());
            raf.writeUTF(Arrays.toString(alumno.getNotas()));
            raf.writeDouble(alumno.getMedia());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerAlumno(){
        int inicio = 0;
        try (RandomAccessFile raf = new RandomAccessFile(FICHERO,"rw")){
            raf.seek(inicio);
            System.out.println(raf.readInt());
            System.out.println(raf.readUTF());
            System.out.println(raf.readUTF());
            System.out.println(raf.readUTF());
            System.out.println(raf.readDouble());
            inicio = inicio + 208;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
