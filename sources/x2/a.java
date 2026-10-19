package x2;
public final class a {
    public final long f49109a;
    public final long f49110b;

    public a(long j10, long j11) {
        this.f49109a = j10;
        this.f49110b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49109a == aVar.f49109a && this.f49110b == aVar.f49110b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49109a) * 31) + ((int) this.f49110b);
    }
}
