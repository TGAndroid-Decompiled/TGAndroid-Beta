package qa;
public final class a {
    public final String f41160a;
    public final long f41161b;
    public final long f41162c;

    public a(long j3, long j10, String str) {
        this.f41160a = str;
        this.f41161b = j3;
        this.f41162c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41160a.equals(aVar.f41160a) && this.f41161b == aVar.f41161b && this.f41162c == aVar.f41162c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41161b;
        long j10 = this.f41162c;
        return ((((this.f41160a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41160a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41161b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f41162c, "}");
    }
}
