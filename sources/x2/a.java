package x2;
public final class a {
    public final long f49561a;
    public final long f49562b;

    public a(long j10, long j11) {
        this.f49561a = j10;
        this.f49562b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49561a == aVar.f49561a && this.f49562b == aVar.f49562b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49561a) * 31) + ((int) this.f49562b);
    }
}
