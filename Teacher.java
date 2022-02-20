public class Teacher{
    private String nameTeacher;
    private String middleName;
    private String lastName;
    private String matter;

    public Teacher(String name, Strign middleName, String matter){
        this.nameTeacher = name;
        this.middleName = middleName;
        this.matter = matter;
    }

    public String getNameTeacher(){
        return this.nameTeacher;
    }

    public void setNameTeacher(String name){
        this.nameTeacher = name;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getMatter(){
        return this.matter;
    }

    public void setMatter(String matter){
        this.matter = matter;
    }

}