package sessions8;

public class Author {
    private String name,email;
    private char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String toString(){
        return "Name:"+name+" ("+gender+") Email:"+email+"";
    }

    public static void main(String[] args) {
        sessions6.Author a=new sessions6.Author("NguyenNgocBaoPhuc","baophuc10112002@gmail.com",'m');
        System.out.println(a);
        System.out.println("Name:"+a.getName());
        System.out.println("Email:"+a.getEmail());
        System.out.println("Gender:"+a.getGender());
        a.setEmail("baophuc10112002@gmail.com");
        System.out.println(a);
    }
}