package va;

import a8.p0;
public final class a {
    public final String f59376a;
    public final long f59377b;
    public final long f59378c;

    public a(long j3, String str, long j10) {
        this.f59376a = str;
        this.f59377b = j3;
        this.f59378c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59376a.equals(aVar.f59376a) && this.f59377b == aVar.f59377b && this.f59378c == aVar.f59378c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59377b;
        long j10 = this.f59378c;
        return ((((this.f59376a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f59376a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f59377b);
        sb2.append(", tokenCreationTimestamp=");
        return p0.r(sb2, this.f59378c, "}");
    }
}
