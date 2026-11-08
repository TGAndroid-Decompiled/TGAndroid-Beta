package va;

import a8.p0;
public final class a {
    public final String f57283a;
    public final long f57284b;
    public final long f57285c;

    public a(long j3, String str, long j10) {
        this.f57283a = str;
        this.f57284b = j3;
        this.f57285c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57283a.equals(aVar.f57283a) && this.f57284b == aVar.f57284b && this.f57285c == aVar.f57285c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57284b;
        long j10 = this.f57285c;
        return ((((this.f57283a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f57283a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f57284b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f57285c, "}");
    }
}
