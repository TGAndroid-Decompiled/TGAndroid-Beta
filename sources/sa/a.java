package sa;
public final class a {
    public final String f48014a;
    public final long f48015b;
    public final long f48016c;

    public a(long j10, long j11, String str) {
        this.f48014a = str;
        this.f48015b = j10;
        this.f48016c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48014a.equals(aVar.f48014a) && this.f48015b == aVar.f48015b && this.f48016c == aVar.f48016c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48015b;
        long j11 = this.f48016c;
        return ((((this.f48014a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f48014a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f48015b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f48016c, "}");
    }
}
