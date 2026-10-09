package qa;
public final class a {
    public final String f46043a;
    public final long f46044b;
    public final long f46045c;

    public a(long j3, long j10, String str) {
        this.f46043a = str;
        this.f46044b = j3;
        this.f46045c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46043a.equals(aVar.f46043a) && this.f46044b == aVar.f46044b && this.f46045c == aVar.f46045c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46044b;
        long j10 = this.f46045c;
        return ((((this.f46043a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f46043a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f46044b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.s(sb2, this.f46045c, "}");
    }
}
