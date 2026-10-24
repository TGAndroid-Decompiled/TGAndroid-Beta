package ra;
public final class a {
    public final String f45575a;
    public final long f45576b;
    public final long f45577c;

    public a(long j10, long j11, String str) {
        this.f45575a = str;
        this.f45576b = j10;
        this.f45577c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45575a.equals(aVar.f45575a) && this.f45576b == aVar.f45576b && this.f45577c == aVar.f45577c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45576b;
        long j11 = this.f45577c;
        return ((((this.f45575a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45575a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45576b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f45577c, "}");
    }
}
