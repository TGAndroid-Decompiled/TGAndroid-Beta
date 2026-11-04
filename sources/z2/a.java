package z2;
public final class a {
    public final long f59571a;
    public final long f59572b;

    public a(long j10, long j11) {
        this.f59571a = j10;
        this.f59572b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f59571a == aVar.f59571a && this.f59572b == aVar.f59572b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f59571a) * 31) + ((int) this.f59572b);
    }
}
