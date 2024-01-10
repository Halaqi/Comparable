public abstract class Developer {
    String fullName;
    int id;
     Developer(int id, String fullName)
    {
        this.fullName=fullName;
        this.id=id;
    }
     abstract double income();

}
