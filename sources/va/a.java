package va;

import a8.p0;
public final class a {
    public final String f57191a;
    public final long f57192b;
    public final long f57193c;

    public a(long j3, String str, long j10) {
        this.f57191a = str;
        this.f57192b = j3;
        this.f57193c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57191a.equals(aVar.f57191a) && this.f57192b == aVar.f57192b && this.f57193c == aVar.f57193c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57192b;
        long j10 = this.f57193c;
        return ((((this.f57191a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f57191a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f57192b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f57193c, "}");
    }
}
