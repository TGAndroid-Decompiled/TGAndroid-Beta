package z9;
public final class v0 extends w1 {
    public final String f51534a;

    public v0(String str) {
        this.f51534a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f51534a.equals(((v0) ((w1) obj)).f51534a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51534a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Log{content="), this.f51534a, "}");
    }
}
