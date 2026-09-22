package x2;
public final class a {
    public final long f45135a;
    public final long f45136b;

    public a(long j3, long j10) {
        this.f45135a = j3;
        this.f45136b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45135a == aVar.f45135a && this.f45136b == aVar.f45136b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45135a) * 31) + ((int) this.f45136b);
    }
}
