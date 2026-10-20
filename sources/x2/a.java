package x2;
public final class a {
    public final long f49116a;
    public final long f49117b;

    public a(long j10, long j11) {
        this.f49116a = j10;
        this.f49117b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49116a == aVar.f49116a && this.f49117b == aVar.f49117b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49116a) * 31) + ((int) this.f49117b);
    }
}
