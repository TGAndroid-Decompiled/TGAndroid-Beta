package x2;
public final class a {
    public final long f50456a;
    public final long f50457b;

    public a(long j3, long j10) {
        this.f50456a = j3;
        this.f50457b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f50456a == aVar.f50456a && this.f50457b == aVar.f50457b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50456a) * 31) + ((int) this.f50457b);
    }
}
