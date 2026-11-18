package va;

import a8.p0;
public final class a {
    public final String f59334a;
    public final long f59335b;
    public final long f59336c;

    public a(long j3, String str, long j10) {
        this.f59334a = str;
        this.f59335b = j3;
        this.f59336c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59334a.equals(aVar.f59334a) && this.f59335b == aVar.f59335b && this.f59336c == aVar.f59336c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59335b;
        long j10 = this.f59336c;
        return ((((this.f59334a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f59334a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f59335b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f59336c, "}");
    }
}
