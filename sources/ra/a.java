package ra;
public final class a {
    public final String f43822a;
    public final long f43823b;
    public final long f43824c;

    public a(long j10, long j11, String str) {
        this.f43822a = str;
        this.f43823b = j10;
        this.f43824c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f43822a.equals(aVar.f43822a) && this.f43823b == aVar.f43823b && this.f43824c == aVar.f43824c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f43823b;
        long j11 = this.f43824c;
        return ((((this.f43822a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f43822a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f43823b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f43824c, "}");
    }
}
