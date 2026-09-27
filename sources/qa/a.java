package qa;
public final class a {
    public final String f41527a;
    public final long f41528b;
    public final long f41529c;

    public a(long j3, long j10, String str) {
        this.f41527a = str;
        this.f41528b = j3;
        this.f41529c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41527a.equals(aVar.f41527a) && this.f41528b == aVar.f41528b && this.f41529c == aVar.f41529c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41528b;
        long j10 = this.f41529c;
        return ((((this.f41527a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41527a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41528b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f41529c, "}");
    }
}
