package x2;
public final class a {
    public final long f49120a;
    public final long f49121b;

    public a(long j10, long j11) {
        this.f49120a = j10;
        this.f49121b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49120a == aVar.f49120a && this.f49121b == aVar.f49121b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49120a) * 31) + ((int) this.f49121b);
    }
}
