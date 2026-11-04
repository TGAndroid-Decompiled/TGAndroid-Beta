package ua;
public final class a {
    public final String f55779a;
    public final long f55780b;
    public final long f55781c;

    public a(long j10, String str, long j11) {
        this.f55779a = str;
        this.f55780b = j10;
        this.f55781c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f55779a.equals(aVar.f55779a) && this.f55780b == aVar.f55780b && this.f55781c == aVar.f55781c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f55780b;
        long j11 = this.f55781c;
        return ((((this.f55779a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f55779a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f55780b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f55781c, "}");
    }
}
