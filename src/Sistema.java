public class Sistema {
    String name;
    double r;


    public Sistema(String name, double r) {
        this.name = name;
        this.r = r;

    }
    public String toString(){
        return name + "," + r;

    }
    public boolean equals(Object x){
        return (this == x);

    }
    public int hasCode(String name, double r){
        return hasCode(this.name, this.r);
    }


}
