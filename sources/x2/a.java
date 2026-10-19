package x2;
public final class a {
    public final long f49111a;
    public final long f49112b;

    public a(long j10, long j11) {
        this.f49111a = j10;
        this.f49112b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49111a == aVar.f49111a && this.f49112b == aVar.f49112b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49111a) * 31) + ((int) this.f49112b);
    }
}
