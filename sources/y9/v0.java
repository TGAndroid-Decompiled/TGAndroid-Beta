package y9;
public final class v0 extends w1 {
    public final String f52078a;

    public v0(String str) {
        this.f52078a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f52078a.equals(((v0) ((w1) obj)).f52078a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52078a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.t(new StringBuilder("Log{content="), this.f52078a, "}");
    }
}
