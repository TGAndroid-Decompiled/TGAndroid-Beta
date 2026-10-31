package x2;
public final class a {
    public final long f52887a;
    public final long f52888b;

    public a(long j10, long j11) {
        this.f52887a = j10;
        this.f52888b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f52887a == aVar.f52887a && this.f52888b == aVar.f52888b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f52887a) * 31) + ((int) this.f52888b);
    }
}
