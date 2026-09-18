package qa;
public final class a {
    public final String f41469a;
    public final long f41470b;
    public final long f41471c;

    public a(long j3, long j10, String str) {
        this.f41469a = str;
        this.f41470b = j3;
        this.f41471c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41469a.equals(aVar.f41469a) && this.f41470b == aVar.f41470b && this.f41471c == aVar.f41471c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41470b;
        long j10 = this.f41471c;
        return ((((this.f41469a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41469a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41470b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f41471c, "}");
    }
}
