package x2;
public final class a {
    public final long f49165a;
    public final long f49166b;

    public a(long j3, long j10) {
        this.f49165a = j3;
        this.f49166b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49165a == aVar.f49165a && this.f49166b == aVar.f49166b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49165a) * 31) + ((int) this.f49166b);
    }
}
