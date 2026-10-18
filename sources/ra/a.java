package ra;
public final class a {
    public final String f45152a;
    public final long f45153b;
    public final long f45154c;

    public a(long j10, long j11, String str) {
        this.f45152a = str;
        this.f45153b = j10;
        this.f45154c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45152a.equals(aVar.f45152a) && this.f45153b == aVar.f45153b && this.f45154c == aVar.f45154c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45153b;
        long j11 = this.f45154c;
        return ((((this.f45152a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45152a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45153b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f45154c, "}");
    }
}
