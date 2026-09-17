package qa;
public final class a {
    public final String f41230a;
    public final long f41231b;
    public final long f41232c;

    public a(long j3, long j10, String str) {
        this.f41230a = str;
        this.f41231b = j3;
        this.f41232c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41230a.equals(aVar.f41230a) && this.f41231b == aVar.f41231b && this.f41232c == aVar.f41232c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41231b;
        long j10 = this.f41232c;
        return ((((this.f41230a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41230a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41231b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f41232c, "}");
    }
}
