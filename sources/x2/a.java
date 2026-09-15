package x2;
public final class a {
    public final long f45139a;
    public final long f45140b;

    public a(long j3, long j10) {
        this.f45139a = j3;
        this.f45140b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45139a == aVar.f45139a && this.f45140b == aVar.f45140b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45139a) * 31) + ((int) this.f45140b);
    }
}
