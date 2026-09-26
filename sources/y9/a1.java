package y9;
public final class a1 extends c2 {
    public final String f46739a;

    public a1(String str) {
        this.f46739a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f46739a.equals(((a1) ((c2) obj)).f46739a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46739a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.a.t(new StringBuilder("User{identifier="), this.f46739a, "}");
    }
}
