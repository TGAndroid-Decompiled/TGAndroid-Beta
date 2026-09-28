package x2;
public final class a {
    public final long f45418a;
    public final long f45419b;

    public a(long j3, long j10) {
        this.f45418a = j3;
        this.f45419b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45418a == aVar.f45418a && this.f45419b == aVar.f45419b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45418a) * 31) + ((int) this.f45419b);
    }
}
