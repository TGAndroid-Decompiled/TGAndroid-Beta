package ra;
public final class a {
    public final String f45178a;
    public final long f45179b;
    public final long f45180c;

    public a(long j10, long j11, String str) {
        this.f45178a = str;
        this.f45179b = j10;
        this.f45180c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45178a.equals(aVar.f45178a) && this.f45179b == aVar.f45179b && this.f45180c == aVar.f45180c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45179b;
        long j11 = this.f45180c;
        return ((((this.f45178a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f45178a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f45179b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.r(sb2, this.f45180c, "}");
    }
}
