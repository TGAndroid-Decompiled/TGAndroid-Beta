package qa;
public final class a {
    public final String f45988a;
    public final long f45989b;
    public final long f45990c;

    public a(long j3, long j10, String str) {
        this.f45988a = str;
        this.f45989b = j3;
        this.f45990c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45988a.equals(aVar.f45988a) && this.f45989b == aVar.f45989b && this.f45990c == aVar.f45990c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45989b;
        long j10 = this.f45990c;
        return ((((this.f45988a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45988a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45989b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.s(sb2, this.f45990c, "}");
    }
}
