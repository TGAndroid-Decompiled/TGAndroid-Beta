package qa;
public final class a {
    public final String f44887a;
    public final long f44888b;
    public final long f44889c;

    public a(long j3, long j10, String str) {
        this.f44887a = str;
        this.f44888b = j3;
        this.f44889c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44887a.equals(aVar.f44887a) && this.f44888b == aVar.f44888b && this.f44889c == aVar.f44889c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44888b;
        long j10 = this.f44889c;
        return ((((this.f44887a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44887a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44888b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f44889c, "}");
    }
}
