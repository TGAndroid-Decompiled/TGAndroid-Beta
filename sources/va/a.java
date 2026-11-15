package va;

import a8.p0;
public final class a {
    public final String f58764a;
    public final long f58765b;
    public final long f58766c;

    public a(long j3, String str, long j10) {
        this.f58764a = str;
        this.f58765b = j3;
        this.f58766c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f58764a.equals(aVar.f58764a) && this.f58765b == aVar.f58765b && this.f58766c == aVar.f58766c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58765b;
        long j10 = this.f58766c;
        return ((((this.f58764a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f58764a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f58765b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f58766c, "}");
    }
}
