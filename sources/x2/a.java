package x2;
public final class a {
    public final long f45434a;
    public final long f45435b;

    public a(long j3, long j10) {
        this.f45434a = j3;
        this.f45435b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45434a == aVar.f45434a && this.f45435b == aVar.f45435b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45434a) * 31) + ((int) this.f45435b);
    }
}
