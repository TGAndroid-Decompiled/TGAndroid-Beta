package x2;
public final class a {
    public final long f49173a;
    public final long f49174b;

    public a(long j3, long j10) {
        this.f49173a = j3;
        this.f49174b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f49173a == aVar.f49173a && this.f49174b == aVar.f49174b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f49173a) * 31) + ((int) this.f49174b);
    }
}
