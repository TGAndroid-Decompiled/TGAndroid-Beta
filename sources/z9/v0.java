package z9;
public final class v0 extends w1 {
    public final String f51959a;

    public v0(String str) {
        this.f51959a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f51959a.equals(((v0) ((w1) obj)).f51959a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51959a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Log{content="), this.f51959a, "}");
    }
}
