package qa;
public final class a {
    public final String f44245a;
    public final long f44246b;
    public final long f44247c;

    public a(long j3, long j10, String str) {
        this.f44245a = str;
        this.f44246b = j3;
        this.f44247c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44245a.equals(aVar.f44245a) && this.f44246b == aVar.f44246b && this.f44247c == aVar.f44247c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44246b;
        long j10 = this.f44247c;
        return ((((this.f44245a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44245a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44246b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f44247c, "}");
    }
}
