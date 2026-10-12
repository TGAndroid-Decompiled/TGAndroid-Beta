package x2;
public final class a {
    public final long f47724a;
    public final long f47725b;

    public a(long j10, long j11) {
        this.f47724a = j10;
        this.f47725b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f47724a == aVar.f47724a && this.f47725b == aVar.f47725b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f47724a) * 31) + ((int) this.f47725b);
    }
}
