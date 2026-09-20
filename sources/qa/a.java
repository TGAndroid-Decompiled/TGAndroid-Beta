package qa;
public final class a {
    public final String f41511a;
    public final long f41512b;
    public final long f41513c;

    public a(long j3, long j10, String str) {
        this.f41511a = str;
        this.f41512b = j3;
        this.f41513c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41511a.equals(aVar.f41511a) && this.f41512b == aVar.f41512b && this.f41513c == aVar.f41513c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41512b;
        long j10 = this.f41513c;
        return ((((this.f41511a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41511a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41512b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f41513c, "}");
    }
}
