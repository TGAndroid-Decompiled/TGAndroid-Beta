package qa;
public final class a {
    public final String f46087a;
    public final long f46088b;
    public final long f46089c;

    public a(long j3, long j10, String str) {
        this.f46087a = str;
        this.f46088b = j3;
        this.f46089c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46087a.equals(aVar.f46087a) && this.f46088b == aVar.f46088b && this.f46089c == aVar.f46089c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46088b;
        long j10 = this.f46089c;
        return ((((this.f46087a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f46087a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f46088b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.s(sb2, this.f46089c, "}");
    }
}
