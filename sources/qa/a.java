package qa;
public final class a {
    public final String f41497a;
    public final long f41498b;
    public final long f41499c;

    public a(long j3, long j10, String str) {
        this.f41497a = str;
        this.f41498b = j3;
        this.f41499c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41497a.equals(aVar.f41497a) && this.f41498b == aVar.f41498b && this.f41499c == aVar.f41499c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41498b;
        long j10 = this.f41499c;
        return ((((this.f41497a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41497a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41498b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f41499c, "}");
    }
}
