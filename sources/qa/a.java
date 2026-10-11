package qa;
public final class a {
    public final String f46121a;
    public final long f46122b;
    public final long f46123c;

    public a(long j3, long j10, String str) {
        this.f46121a = str;
        this.f46122b = j3;
        this.f46123c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46121a.equals(aVar.f46121a) && this.f46122b == aVar.f46122b && this.f46123c == aVar.f46123c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46122b;
        long j10 = this.f46123c;
        return ((((this.f46121a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f46121a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f46122b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.s(sb2, this.f46123c, "}");
    }
}
