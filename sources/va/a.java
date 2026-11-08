package va;

import a8.p0;
public final class a {
    public final String f57282a;
    public final long f57283b;
    public final long f57284c;

    public a(long j3, String str, long j10) {
        this.f57282a = str;
        this.f57283b = j3;
        this.f57284c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57282a.equals(aVar.f57282a) && this.f57283b == aVar.f57283b && this.f57284c == aVar.f57284c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57283b;
        long j10 = this.f57284c;
        return ((((this.f57282a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f57282a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f57283b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f57284c, "}");
    }
}
