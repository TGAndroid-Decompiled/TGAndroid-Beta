package x2;
public final class a {
    public final long f48713a;
    public final long f48714b;

    public a(long j3, long j10) {
        this.f48713a = j3;
        this.f48714b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f48713a == aVar.f48713a && this.f48714b == aVar.f48714b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f48713a) * 31) + ((int) this.f48714b);
    }
}
