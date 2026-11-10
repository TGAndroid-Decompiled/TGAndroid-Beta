package va;

import a8.p0;
public final class a {
    public final String f57291a;
    public final long f57292b;
    public final long f57293c;

    public a(long j3, String str, long j10) {
        this.f57291a = str;
        this.f57292b = j3;
        this.f57293c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f57291a.equals(aVar.f57291a) && this.f57292b == aVar.f57292b && this.f57293c == aVar.f57293c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57292b;
        long j10 = this.f57293c;
        return ((((this.f57291a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f57291a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f57292b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f57293c, "}");
    }
}
