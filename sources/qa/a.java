package qa;
public final class a {
    public final String f41532a;
    public final long f41533b;
    public final long f41534c;

    public a(long j3, long j10, String str) {
        this.f41532a = str;
        this.f41533b = j3;
        this.f41534c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41532a.equals(aVar.f41532a) && this.f41533b == aVar.f41533b && this.f41534c == aVar.f41534c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41533b;
        long j10 = this.f41534c;
        return ((((this.f41532a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41532a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41533b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f41534c, "}");
    }
}
