package z9;

import a9.p;

public final class a {

    public final String f50254a;

    public final long f50255b;

    public final long f50256c;

    public a(long j10, long j11, String str) {
        this.f50254a = str;
        this.f50255b = j10;
        this.f50256c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f50254a.equals(aVar.f50254a) && this.f50255b == aVar.f50255b && this.f50256c == aVar.f50256c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f50254a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f50255b;
        long j11 = this.f50256c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f50254a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f50255b);
        sb2.append(", tokenCreationTimestamp=");
        return p.o(sb2, this.f50256c, "}");
    }
}
