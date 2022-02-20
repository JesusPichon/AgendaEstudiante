public class Student{
    private String name;
    private String middleName;
    private String lastName;

    public Student(String name, String middle, String last){
        this.name = name;
        this.middleName = middle;
        this.lastName = last;
    }

    public String getNameStudent(){
        return this.name;
    }

    public void setNameStudent(String name){
        this.name = name;
    }

    public String getMiddleNameStudent(){
        return this.middleName;
    }

    public void setMiddleName(String middle){
        this.middleName = middle;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String last){
        this.lastName = last;
    }
}