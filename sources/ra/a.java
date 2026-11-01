package ra;
public final class a {
    public final String f46466a;
    public final long f46467b;
    public final long f46468c;

    public a(long j10, String str, long j11) {
        this.f46466a = str;
        this.f46467b = j10;
        this.f46468c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46466a.equals(aVar.f46466a) && this.f46467b == aVar.f46467b && this.f46468c == aVar.f46468c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46467b;
        long j11 = this.f46468c;
        return ((((this.f46466a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f46466a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f46467b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.q(sb2, this.f46468c, "}");
    }
}
