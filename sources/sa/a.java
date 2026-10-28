package sa;
public final class a {
    public final String f48055a;
    public final long f48056b;
    public final long f48057c;

    public a(long j10, long j11, String str) {
        this.f48055a = str;
        this.f48056b = j10;
        this.f48057c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48055a.equals(aVar.f48055a) && this.f48056b == aVar.f48056b && this.f48057c == aVar.f48057c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48056b;
        long j11 = this.f48057c;
        return ((((this.f48055a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f48055a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f48056b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f48057c, "}");
    }
}
