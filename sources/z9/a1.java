package z9;
public final class a1 extends c2 {
    public final String f51315a;

    public a1(String str) {
        this.f51315a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f51315a.equals(((a1) ((c2) obj)).f51315a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51315a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("User{identifier="), this.f51315a, "}");
    }
}
