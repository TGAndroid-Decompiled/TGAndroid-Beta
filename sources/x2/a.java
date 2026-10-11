package x2;
public final class a {
    public final long f50546a;
    public final long f50547b;

    public a(long j3, long j10) {
        this.f50546a = j3;
        this.f50547b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f50546a == aVar.f50546a && this.f50547b == aVar.f50547b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50546a) * 31) + ((int) this.f50547b);
    }
}
