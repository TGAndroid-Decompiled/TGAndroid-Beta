package x2;
public final class a {
    public final long f49132a;
    public final long f49133b;

    public a(long j10, long j11) {
        this.f49132a = j10;
        this.f49133b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49132a == aVar.f49132a && this.f49133b == aVar.f49133b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49132a) * 31) + ((int) this.f49133b);
    }
}
