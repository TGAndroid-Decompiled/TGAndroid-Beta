package x2;
public final class a {
    public final long f47723a;
    public final long f47724b;

    public a(long j10, long j11) {
        this.f47723a = j10;
        this.f47724b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f47723a == aVar.f47723a && this.f47724b == aVar.f47724b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f47723a) * 31) + ((int) this.f47724b);
    }
}
