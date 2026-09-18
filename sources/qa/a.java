package qa;
public final class a {
    public final String f41235a;
    public final long f41236b;
    public final long f41237c;

    public a(long j3, long j10, String str) {
        this.f41235a = str;
        this.f41236b = j3;
        this.f41237c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41235a.equals(aVar.f41235a) && this.f41236b == aVar.f41236b && this.f41237c == aVar.f41237c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41236b;
        long j10 = this.f41237c;
        return ((((this.f41235a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41235a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41236b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f41237c, "}");
    }
}
