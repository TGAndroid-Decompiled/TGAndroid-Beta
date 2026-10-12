package z9;
public final class v0 extends w1 {
    public final String f50103a;

    public v0(String str) {
        this.f50103a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f50103a.equals(((v0) ((w1) obj)).f50103a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50103a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Log{content="), this.f50103a, "}");
    }
}
