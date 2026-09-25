package qa;
public final class a {
    public final String f41498a;
    public final long f41499b;
    public final long f41500c;

    public a(long j3, long j10, String str) {
        this.f41498a = str;
        this.f41499b = j3;
        this.f41500c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41498a.equals(aVar.f41498a) && this.f41499b == aVar.f41499b && this.f41500c == aVar.f41500c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41499b;
        long j10 = this.f41500c;
        return ((((this.f41498a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41498a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41499b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f41500c, "}");
    }
}
