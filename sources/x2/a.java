package x2;
public final class a {
    public final long f48683a;
    public final long f48684b;

    public a(long j3, long j10) {
        this.f48683a = j3;
        this.f48684b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f48683a == aVar.f48683a && this.f48684b == aVar.f48684b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f48683a) * 31) + ((int) this.f48684b);
    }
}
