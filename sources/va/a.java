package va;

import a8.p0;
public final class a {
    public final String f59333a;
    public final long f59334b;
    public final long f59335c;

    public a(long j3, String str, long j10) {
        this.f59333a = str;
        this.f59334b = j3;
        this.f59335c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59333a.equals(aVar.f59333a) && this.f59334b == aVar.f59334b && this.f59335c == aVar.f59335c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59334b;
        long j10 = this.f59335c;
        return ((((this.f59333a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f59333a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f59334b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f59335c, "}");
    }
}
