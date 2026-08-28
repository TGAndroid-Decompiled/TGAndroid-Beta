package y9;
public final class a {
    public final String f49658a;
    public final long f49659b;
    public final long f49660c;

    public a(long j10, long j11, String str) {
        this.f49658a = str;
        this.f49659b = j10;
        this.f49660c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49658a.equals(aVar.f49658a) && this.f49659b == aVar.f49659b && this.f49660c == aVar.f49660c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f49659b;
        long j11 = this.f49660c;
        return ((((this.f49658a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f49658a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f49659b);
        sb2.append(", tokenCreationTimestamp=");
        return aa.d.q(sb2, this.f49660c, "}");
    }
}
