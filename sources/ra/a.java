package ra;
public final class a {
    public final String f45164a;
    public final long f45165b;
    public final long f45166c;

    public a(long j10, long j11, String str) {
        this.f45164a = str;
        this.f45165b = j10;
        this.f45166c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45164a.equals(aVar.f45164a) && this.f45165b == aVar.f45165b && this.f45166c == aVar.f45166c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45165b;
        long j11 = this.f45166c;
        return ((((this.f45164a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45164a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45165b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f45166c, "}");
    }
}
