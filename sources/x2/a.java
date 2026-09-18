package x2;
public final class a {
    public final long f45390a;
    public final long f45391b;

    public a(long j3, long j10) {
        this.f45390a = j3;
        this.f45391b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45390a == aVar.f45390a && this.f45391b == aVar.f45391b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45390a) * 31) + ((int) this.f45391b);
    }
}
