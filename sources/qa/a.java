package qa;
public final class a {
    public final String f45980a;
    public final long f45981b;
    public final long f45982c;

    public a(long j3, long j10, String str) {
        this.f45980a = str;
        this.f45981b = j3;
        this.f45982c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45980a.equals(aVar.f45980a) && this.f45981b == aVar.f45981b && this.f45982c == aVar.f45982c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45981b;
        long j10 = this.f45982c;
        return ((((this.f45980a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45980a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45981b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.s(sb2, this.f45982c, "}");
    }
}
