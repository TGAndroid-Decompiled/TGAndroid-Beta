package qa;
public final class a {
    public final String f41499a;
    public final long f41500b;
    public final long f41501c;

    public a(long j3, long j10, String str) {
        this.f41499a = str;
        this.f41500b = j3;
        this.f41501c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41499a.equals(aVar.f41499a) && this.f41500b == aVar.f41500b && this.f41501c == aVar.f41501c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41500b;
        long j10 = this.f41501c;
        return ((((this.f41499a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41499a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41500b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f41501c, "}");
    }
}
