package qa;
public final class a {
    public final String f44872a;
    public final long f44873b;
    public final long f44874c;

    public a(long j3, long j10, String str) {
        this.f44872a = str;
        this.f44873b = j3;
        this.f44874c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44872a.equals(aVar.f44872a) && this.f44873b == aVar.f44873b && this.f44874c == aVar.f44874c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44873b;
        long j10 = this.f44874c;
        return ((((this.f44872a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44872a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44873b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f44874c, "}");
    }
}
