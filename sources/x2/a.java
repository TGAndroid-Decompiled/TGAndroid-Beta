package x2;
public final class a {
    public final long f44479a;
    public final long f44480b;

    public a(long j3, long j10) {
        this.f44479a = j3;
        this.f44480b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f44479a == aVar.f44479a && this.f44480b == aVar.f44480b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f44479a) * 31) + ((int) this.f44480b);
    }
}
