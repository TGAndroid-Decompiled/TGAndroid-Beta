package z9;
public final class a1 extends c2 {
    public final String f55223a;

    public a1(String str) {
        this.f55223a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f55223a.equals(((a1) ((c2) obj)).f55223a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55223a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.r(new StringBuilder("User{identifier="), this.f55223a, "}");
    }
}
