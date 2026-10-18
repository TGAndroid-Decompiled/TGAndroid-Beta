package x2;
public final class a {
    public final long f49157a;
    public final long f49158b;

    public a(long j10, long j11) {
        this.f49157a = j10;
        this.f49158b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49157a == aVar.f49157a && this.f49158b == aVar.f49158b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49157a) * 31) + ((int) this.f49158b);
    }
}
