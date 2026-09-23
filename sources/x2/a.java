package x2;
public final class a {
    public final long f45089a;
    public final long f45090b;

    public a(long j3, long j10) {
        this.f45089a = j3;
        this.f45090b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45089a == aVar.f45089a && this.f45090b == aVar.f45090b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45089a) * 31) + ((int) this.f45090b);
    }
}
