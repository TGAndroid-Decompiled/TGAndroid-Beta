package qa;
public final class a {
    public final String f44274a;
    public final long f44275b;
    public final long f44276c;

    public a(long j3, long j10, String str) {
        this.f44274a = str;
        this.f44275b = j3;
        this.f44276c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44274a.equals(aVar.f44274a) && this.f44275b == aVar.f44275b && this.f44276c == aVar.f44276c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44275b;
        long j10 = this.f44276c;
        return ((((this.f44274a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44274a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44275b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f44276c, "}");
    }
}
