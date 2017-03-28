/**
 * Created by yizhen on 17-3-28.
 */
public class Demo {
    public static void main(String[] args) {
        Student.StudentBuilder stringBuilder=new Student.StudentBuilder("yizhenn","xu",25);
        System.out.println(stringBuilder.build());

        stringBuilder.classId(11);
        System.out.println(stringBuilder.build());

        stringBuilder.desc("test");
        System.out.println(stringBuilder.build());
    }
}
class Student{
    private String firstName;
    private String lastName;
    private int age;
    private int classId;
    private String desc;

    private Student(){}


    static class StudentBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private int classId;
        private String desc;
        public StudentBuilder(String firstName,String lastName,int age){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
        }
        public void classId(int classId){
            this.classId=classId;
        }
        public void desc(String desc){
            this.desc=desc;
        }
        public Student build(){
            Student student=new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            if(classId!=0)
                student.setClassId(classId);
            if(desc!=null)
                student.setDesc(desc);
            return student;
        }
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setClassId(int classId) {
        this.classId = classId;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getClassId() {
        return classId;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                ", desc='" + desc + '\'' +
                '}';
    }
}
