package va;

import a8.p0;
public final class a {
    public final String f59372a;
    public final long f59373b;
    public final long f59374c;

    public a(long j3, String str, long j10) {
        this.f59372a = str;
        this.f59373b = j3;
        this.f59374c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59372a.equals(aVar.f59372a) && this.f59373b == aVar.f59373b && this.f59374c == aVar.f59374c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59373b;
        long j10 = this.f59374c;
        return ((((this.f59372a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f59372a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f59373b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f59374c, "}");
    }
}
