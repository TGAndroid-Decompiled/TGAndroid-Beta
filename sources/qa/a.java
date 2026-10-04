package qa;
public final class a {
    public final String f44873a;
    public final long f44874b;
    public final long f44875c;

    public a(long j3, long j10, String str) {
        this.f44873a = str;
        this.f44874b = j3;
        this.f44875c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44873a.equals(aVar.f44873a) && this.f44874b == aVar.f44874b && this.f44875c == aVar.f44875c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44874b;
        long j10 = this.f44875c;
        return ((((this.f44873a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44873a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44874b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f44875c, "}");
    }
}
