package qa;
public final class a {
    public final String f44273a;
    public final long f44274b;
    public final long f44275c;

    public a(long j3, long j10, String str) {
        this.f44273a = str;
        this.f44274b = j3;
        this.f44275c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44273a.equals(aVar.f44273a) && this.f44274b == aVar.f44274b && this.f44275c == aVar.f44275c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44274b;
        long j10 = this.f44275c;
        return ((((this.f44273a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44273a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44274b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f44275c, "}");
    }
}
