package z9;
public final class v0 extends w1 {
    public final String f55406a;

    public v0(String str) {
        this.f55406a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f55406a.equals(((v0) ((w1) obj)).f55406a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55406a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.r(new StringBuilder("Log{content="), this.f55406a, "}");
    }
}
