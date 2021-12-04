package Solution.wildhack;

public class CustomerModel {

    public CustomerModel(int ID, String name, int age, Boolean isActive) {
        this.ID = ID;
        Name = name;
        Age = age;
        this.isActive = isActive;
    }

    private int ID;
    private String Name;
    private int Age;
    private Boolean isActive;

    public CustomerModel() {
    }


    @Override
    public String toString() {
        return "CustomerModel{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", isActive=" + isActive +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
