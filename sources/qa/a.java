package qa;
public final class a {
    public final String f44880a;
    public final long f44881b;
    public final long f44882c;

    public a(long j3, long j10, String str) {
        this.f44880a = str;
        this.f44881b = j3;
        this.f44882c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44880a.equals(aVar.f44880a) && this.f44881b == aVar.f44881b && this.f44882c == aVar.f44882c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44881b;
        long j10 = this.f44882c;
        return ((((this.f44880a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f44880a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f44881b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.a.s(sb2, this.f44882c, "}");
    }
}
