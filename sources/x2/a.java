package x2;
public final class a {
    public final long f49180a;
    public final long f49181b;

    public a(long j3, long j10) {
        this.f49180a = j3;
        this.f49181b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49180a == aVar.f49180a && this.f49181b == aVar.f49181b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49180a) * 31) + ((int) this.f49181b);
    }
}
