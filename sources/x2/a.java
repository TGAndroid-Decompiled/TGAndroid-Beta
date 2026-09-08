package x2;
public final class a {
    public final long f48712a;
    public final long f48713b;

    public a(long j3, long j10) {
        this.f48712a = j3;
        this.f48713b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f48712a == aVar.f48712a && this.f48713b == aVar.f48713b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f48712a) * 31) + ((int) this.f48713b);
    }
}
