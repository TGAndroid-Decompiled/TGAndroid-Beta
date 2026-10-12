package ra;
public final class a {
    public final String f44063a;
    public final long f44064b;
    public final long f44065c;

    public a(long j10, long j11, String str) {
        this.f44063a = str;
        this.f44064b = j10;
        this.f44065c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44063a.equals(aVar.f44063a) && this.f44064b == aVar.f44064b && this.f44065c == aVar.f44065c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f44064b;
        long j11 = this.f44065c;
        return ((((this.f44063a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44063a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44064b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f44065c, "}");
    }
}
