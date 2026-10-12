package z9;
public final class a1 extends c2 {
    public final String f49920a;

    public a1(String str) {
        this.f49920a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f49920a.equals(((a1) ((c2) obj)).f49920a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49920a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("User{identifier="), this.f49920a, "}");
    }
}
