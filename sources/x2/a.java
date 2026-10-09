package x2;
public final class a {
    public final long f50458a;
    public final long f50459b;

    public a(long j3, long j10) {
        this.f50458a = j3;
        this.f50459b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f50458a == aVar.f50458a && this.f50459b == aVar.f50459b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50458a) * 31) + ((int) this.f50459b);
    }
}
