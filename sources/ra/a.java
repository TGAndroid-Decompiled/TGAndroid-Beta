package ra;
public final class a {
    public final String f45160a;
    public final long f45161b;
    public final long f45162c;

    public a(long j10, long j11, String str) {
        this.f45160a = str;
        this.f45161b = j10;
        this.f45162c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45160a.equals(aVar.f45160a) && this.f45161b == aVar.f45161b && this.f45162c == aVar.f45162c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45161b;
        long j11 = this.f45162c;
        return ((((this.f45160a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45160a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45161b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f45162c, "}");
    }
}
