package z9;
public final class v0 extends w1 {
    public final String f51487a;

    public v0(String str) {
        this.f51487a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f51487a.equals(((v0) ((w1) obj)).f51487a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51487a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Log{content="), this.f51487a, "}");
    }
}
