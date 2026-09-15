package qa;
public final class a {
    public final String f41208a;
    public final long f41209b;
    public final long f41210c;

    public a(long j3, long j10, String str) {
        this.f41208a = str;
        this.f41209b = j3;
        this.f41210c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f41208a.equals(aVar.f41208a) && this.f41209b == aVar.f41209b && this.f41210c == aVar.f41210c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41209b;
        long j10 = this.f41210c;
        return ((((this.f41208a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f41208a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41209b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.r(sb2, this.f41210c, "}");
    }
}
