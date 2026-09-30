package qa;
public final class a {
    public final String f41596a;
    public final long f41597b;
    public final long f41598c;

    public a(long j3, long j10, String str) {
        this.f41596a = str;
        this.f41597b = j3;
        this.f41598c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41596a.equals(aVar.f41596a) && this.f41597b == aVar.f41597b && this.f41598c == aVar.f41598c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41597b;
        long j10 = this.f41598c;
        return ((((this.f41596a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41596a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41597b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f41598c, "}");
    }
}
