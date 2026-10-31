package ra;
public final class a {
    public final String f46455a;
    public final long f46456b;
    public final long f46457c;

    public a(long j10, String str, long j11) {
        this.f46455a = str;
        this.f46456b = j10;
        this.f46457c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46455a.equals(aVar.f46455a) && this.f46456b == aVar.f46456b && this.f46457c == aVar.f46457c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46456b;
        long j11 = this.f46457c;
        return ((((this.f46455a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f46455a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f46456b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.q(sb2, this.f46457c, "}");
    }
}
