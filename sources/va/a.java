package va;

import a8.p0;
public final class a {
    public final String f59339a;
    public final long f59340b;
    public final long f59341c;

    public a(long j3, String str, long j10) {
        this.f59339a = str;
        this.f59340b = j3;
        this.f59341c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59339a.equals(aVar.f59339a) && this.f59340b == aVar.f59340b && this.f59341c == aVar.f59341c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59340b;
        long j10 = this.f59341c;
        return ((((this.f59339a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f59339a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f59340b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f59341c, "}");
    }
}
