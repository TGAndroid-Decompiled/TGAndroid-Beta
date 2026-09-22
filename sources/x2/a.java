package x2;
public final class a {
    public final long f45455a;
    public final long f45456b;

    public a(long j3, long j10) {
        this.f45455a = j3;
        this.f45456b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f45455a == aVar.f45455a && this.f45456b == aVar.f45456b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45455a) * 31) + ((int) this.f45456b);
    }
}
