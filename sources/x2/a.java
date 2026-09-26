package x2;
public final class a {
    public final long f45417a;
    public final long f45418b;

    public a(long j3, long j10) {
        this.f45417a = j3;
        this.f45418b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45417a == aVar.f45417a && this.f45418b == aVar.f45418b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45417a) * 31) + ((int) this.f45418b);
    }
}
