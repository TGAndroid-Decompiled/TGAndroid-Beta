package x2;
public final class a {
    public final long f48684a;
    public final long f48685b;

    public a(long j3, long j10) {
        this.f48684a = j3;
        this.f48685b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f48684a == aVar.f48684a && this.f48685b == aVar.f48685b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f48684a) * 31) + ((int) this.f48685b);
    }
}
