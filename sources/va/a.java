package va;

import a8.p0;
public final class a {
    public final String f57295a;
    public final long f57296b;
    public final long f57297c;

    public a(long j3, String str, long j10) {
        this.f57295a = str;
        this.f57296b = j3;
        this.f57297c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57295a.equals(aVar.f57295a) && this.f57296b == aVar.f57296b && this.f57297c == aVar.f57297c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57296b;
        long j10 = this.f57297c;
        return ((((this.f57295a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f57295a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f57296b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f57297c, "}");
    }
}
