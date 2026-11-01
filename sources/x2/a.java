package x2;
public final class a {
    public final long f52905a;
    public final long f52906b;

    public a(long j10, long j11) {
        this.f52905a = j10;
        this.f52906b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f52905a == aVar.f52905a && this.f52906b == aVar.f52906b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f52905a) * 31) + ((int) this.f52906b);
    }
}
