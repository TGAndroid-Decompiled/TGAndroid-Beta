package x2;
public final class a {
    public final long f51349a;
    public final long f51350b;

    public a(long j10, long j11) {
        this.f51349a = j10;
        this.f51350b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f51349a == aVar.f51349a && this.f51350b == aVar.f51350b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f51349a) * 31) + ((int) this.f51350b);
    }
}
