package y9;
public final class a1 extends c2 {
    public final String f49692a;

    public a1(String str) {
        this.f49692a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f49692a.equals(((a1) ((c2) obj)).f49692a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49692a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.a.s(new StringBuilder("User{identifier="), this.f49692a, "}");
    }
}
