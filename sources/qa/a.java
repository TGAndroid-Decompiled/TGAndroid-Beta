package qa;
public final class a {
    public final String f41204a;
    public final long f41205b;
    public final long f41206c;

    public a(long j3, long j10, String str) {
        this.f41204a = str;
        this.f41205b = j3;
        this.f41206c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41204a.equals(aVar.f41204a) && this.f41205b == aVar.f41205b && this.f41206c == aVar.f41206c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41205b;
        long j10 = this.f41206c;
        return ((((this.f41204a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41204a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41205b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f41206c, "}");
    }
}
