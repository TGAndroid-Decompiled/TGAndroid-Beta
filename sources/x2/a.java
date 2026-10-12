package x2;
public final class a {
    public final long f50695a;
    public final long f50696b;

    public a(long j3, long j10) {
        this.f50695a = j3;
        this.f50696b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f50695a == aVar.f50695a && this.f50696b == aVar.f50696b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50695a) * 31) + ((int) this.f50696b);
    }
}
