package x2;
public final class a {
    public final long f51288a;
    public final long f51289b;

    public a(long j10, long j11) {
        this.f51288a = j10;
        this.f51289b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f51288a == aVar.f51288a && this.f51289b == aVar.f51289b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f51288a) * 31) + ((int) this.f51289b);
    }
}
