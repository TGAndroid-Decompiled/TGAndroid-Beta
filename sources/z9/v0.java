package z9;
public final class v0 extends w1 {
    public final String f51509a;

    public v0(String str) {
        this.f51509a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f51509a.equals(((v0) ((w1) obj)).f51509a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51509a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Log{content="), this.f51509a, "}");
    }
}
