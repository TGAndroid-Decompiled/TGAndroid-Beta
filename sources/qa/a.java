package qa;
public final class a {
    public final String f44246a;
    public final long f44247b;
    public final long f44248c;

    public a(long j3, long j10, String str) {
        this.f44246a = str;
        this.f44247b = j3;
        this.f44248c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44246a.equals(aVar.f44246a) && this.f44247b == aVar.f44247b && this.f44248c == aVar.f44248c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44247b;
        long j10 = this.f44248c;
        return ((((this.f44246a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44246a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44247b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f44248c, "}");
    }
}
