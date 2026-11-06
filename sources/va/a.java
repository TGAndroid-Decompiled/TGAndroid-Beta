package va;

import a8.p0;
public final class a {
    public final String f57190a;
    public final long f57191b;
    public final long f57192c;

    public a(long j3, String str, long j10) {
        this.f57190a = str;
        this.f57191b = j3;
        this.f57192c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57190a.equals(aVar.f57190a) && this.f57191b == aVar.f57191b && this.f57192c == aVar.f57192c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57191b;
        long j10 = this.f57192c;
        return ((((this.f57190a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f57190a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f57191b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f57192c, "}");
    }
}
