package va;

import a8.p0;
public final class a {
    public final String f57166a;
    public final long f57167b;
    public final long f57168c;

    public a(long j3, String str, long j10) {
        this.f57166a = str;
        this.f57167b = j3;
        this.f57168c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57166a.equals(aVar.f57166a) && this.f57167b == aVar.f57167b && this.f57168c == aVar.f57168c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57167b;
        long j10 = this.f57168c;
        return ((((this.f57166a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f57166a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f57167b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f57168c, "}");
    }
}
