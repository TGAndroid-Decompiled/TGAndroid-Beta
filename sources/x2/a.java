package x2;
public final class a {
    public final long f49164a;
    public final long f49165b;

    public a(long j3, long j10) {
        this.f49164a = j3;
        this.f49165b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49164a == aVar.f49164a && this.f49165b == aVar.f49165b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49164a) * 31) + ((int) this.f49165b);
    }
}
