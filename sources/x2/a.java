package x2;
public final class a {
    public final long f49562a;
    public final long f49563b;

    public a(long j10, long j11) {
        this.f49562a = j10;
        this.f49563b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49562a == aVar.f49562a && this.f49563b == aVar.f49563b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49562a) * 31) + ((int) this.f49563b);
    }
}
