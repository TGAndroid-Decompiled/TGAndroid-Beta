package ra;
public final class a {
    public final String f45150a;
    public final long f45151b;
    public final long f45152c;

    public a(long j10, long j11, String str) {
        this.f45150a = str;
        this.f45151b = j10;
        this.f45152c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45150a.equals(aVar.f45150a) && this.f45151b == aVar.f45151b && this.f45152c == aVar.f45152c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45151b;
        long j11 = this.f45152c;
        return ((((this.f45150a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45150a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45151b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f45152c, "}");
    }
}
