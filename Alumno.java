public class Alumno{

    private String nombreAlumno;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int matricula;

    public Alumno(String nombre,String apellidoPaterno,Strign apellidoMaterno,int matricula){
      this.nombreAlumno = nombre;
      this.apellidoPaterno = apellidoPaterno;
      this.apellidoMaterno = apellidoMaterno;
      this.matricula = matricula;  
    }

    public String getNombreAlumno(){
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombre){
        this.nombreAlumno = nombre;
    }

}