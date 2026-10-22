package x2;
public final class a {
    public final long f49119a;
    public final long f49120b;

    public a(long j10, long j11) {
        this.f49119a = j10;
        this.f49120b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49119a == aVar.f49119a && this.f49120b == aVar.f49120b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49119a) * 31) + ((int) this.f49120b);
    }
}
