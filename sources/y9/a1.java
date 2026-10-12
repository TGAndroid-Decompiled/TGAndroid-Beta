package y9;
public final class a1 extends c2 {
    public final String f52102a;

    public a1(String str) {
        this.f52102a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f52102a.equals(((a1) ((c2) obj)).f52102a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52102a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.t(new StringBuilder("User{identifier="), this.f52102a, "}");
    }
}
