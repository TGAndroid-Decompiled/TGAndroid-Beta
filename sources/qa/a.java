package qa;
public final class a {
    public final String f46155a;
    public final long f46156b;
    public final long f46157c;

    public a(long j3, long j10, String str) {
        this.f46155a = str;
        this.f46156b = j3;
        this.f46157c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46155a.equals(aVar.f46155a) && this.f46156b == aVar.f46156b && this.f46157c == aVar.f46157c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46156b;
        long j10 = this.f46157c;
        return ((((this.f46155a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f46155a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f46156b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.s(sb2, this.f46157c, "}");
    }
}
