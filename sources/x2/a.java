package x2;
public final class a {
    public final long f49110a;
    public final long f49111b;

    public a(long j10, long j11) {
        this.f49110a = j10;
        this.f49111b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49110a == aVar.f49110a && this.f49111b == aVar.f49111b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49110a) * 31) + ((int) this.f49111b);
    }
}
