package x2;
public final class a {
    public final long f50580a;
    public final long f50581b;

    public a(long j3, long j10) {
        this.f50580a = j3;
        this.f50581b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f50580a == aVar.f50580a && this.f50581b == aVar.f50581b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50580a) * 31) + ((int) this.f50581b);
    }
}
