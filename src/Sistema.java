import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sistema sistema = (Sistema) o;
        return Double.compare(r, sistema.r) == 0 && Objects.equals(name, sistema.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, r);
    }
}
