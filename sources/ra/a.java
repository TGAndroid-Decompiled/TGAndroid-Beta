package ra;
public final class a {
    public final String f45576a;
    public final long f45577b;
    public final long f45578c;

    public a(long j10, long j11, String str) {
        this.f45576a = str;
        this.f45577b = j10;
        this.f45578c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45576a.equals(aVar.f45576a) && this.f45577b == aVar.f45577b && this.f45578c == aVar.f45578c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45577b;
        long j11 = this.f45578c;
        return ((((this.f45576a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45576a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45577b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f45578c, "}");
    }
}
