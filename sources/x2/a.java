package x2;
public final class a {
    public final long f45525a;
    public final long f45526b;

    public a(long j3, long j10) {
        this.f45525a = j3;
        this.f45526b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45525a == aVar.f45525a && this.f45526b == aVar.f45526b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45525a) * 31) + ((int) this.f45526b);
    }
}
