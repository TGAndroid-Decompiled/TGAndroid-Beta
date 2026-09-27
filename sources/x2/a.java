package x2;
public final class a {
    public final long f45463a;
    public final long f45464b;

    public a(long j3, long j10) {
        this.f45463a = j3;
        this.f45464b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45463a == aVar.f45463a && this.f45464b == aVar.f45464b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45463a) * 31) + ((int) this.f45464b);
    }
}
