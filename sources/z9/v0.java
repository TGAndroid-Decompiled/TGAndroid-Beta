package z9;
public final class v0 extends w1 {
    public final String f55424a;

    public v0(String str) {
        this.f55424a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f55424a.equals(((v0) ((w1) obj)).f55424a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55424a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.r(new StringBuilder("Log{content="), this.f55424a, "}");
    }
}
