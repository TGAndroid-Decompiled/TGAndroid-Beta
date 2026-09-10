package qa;
public final class a {
    public final String f40585a;
    public final long f40586b;
    public final long f40587c;

    public a(long j3, long j10, String str) {
        this.f40585a = str;
        this.f40586b = j3;
        this.f40587c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f40585a.equals(aVar.f40585a) && this.f40586b == aVar.f40586b && this.f40587c == aVar.f40587c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f40586b;
        long j10 = this.f40587c;
        return ((((this.f40585a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f40585a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f40586b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f40587c, "}");
    }
}
