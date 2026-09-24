package qa;
public final class a {
    public final String f41483a;
    public final long f41484b;
    public final long f41485c;

    public a(long j3, long j10, String str) {
        this.f41483a = str;
        this.f41484b = j3;
        this.f41485c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41483a.equals(aVar.f41483a) && this.f41484b == aVar.f41484b && this.f41485c == aVar.f41485c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41484b;
        long j10 = this.f41485c;
        return ((((this.f41483a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41483a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41484b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f41485c, "}");
    }
}
