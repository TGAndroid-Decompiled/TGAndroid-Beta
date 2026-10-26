package sa;
public final class a {
    public final String f48017a;
    public final long f48018b;
    public final long f48019c;

    public a(long j10, long j11, String str) {
        this.f48017a = str;
        this.f48018b = j10;
        this.f48019c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48017a.equals(aVar.f48017a) && this.f48018b == aVar.f48018b && this.f48019c == aVar.f48019c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48018b;
        long j11 = this.f48019c;
        return ((((this.f48017a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f48017a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f48018b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f48019c, "}");
    }
}
