package qa;
public final class a {
    public final String f41496a;
    public final long f41497b;
    public final long f41498c;

    public a(long j3, long j10, String str) {
        this.f41496a = str;
        this.f41497b = j3;
        this.f41498c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41496a.equals(aVar.f41496a) && this.f41497b == aVar.f41497b && this.f41498c == aVar.f41498c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41497b;
        long j10 = this.f41498c;
        return ((((this.f41496a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41496a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41497b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f41498c, "}");
    }
}
