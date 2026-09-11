package y9;
public final class v0 extends w1 {
    public final String f49902a;

    public v0(String str) {
        this.f49902a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f49902a.equals(((v0) ((w1) obj)).f49902a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49902a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.a.s(new StringBuilder("Log{content="), this.f49902a, "}");
    }
}
