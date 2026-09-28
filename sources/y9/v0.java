package y9;
public final class v0 extends w1 {
    public final String f46923a;

    public v0(String str) {
        this.f46923a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f46923a.equals(((v0) ((w1) obj)).f46923a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46923a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.a.t(new StringBuilder("Log{content="), this.f46923a, "}");
    }
}
