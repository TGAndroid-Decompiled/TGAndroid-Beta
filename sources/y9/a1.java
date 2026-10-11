package y9;
public final class a1 extends c2 {
    public final String f51957a;

    public a1(String str) {
        this.f51957a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f51957a.equals(((a1) ((c2) obj)).f51957a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51957a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.t(new StringBuilder("User{identifier="), this.f51957a, "}");
    }
}
