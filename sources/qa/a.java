package qa;
public final class a {
    public final String f46041a;
    public final long f46042b;
    public final long f46043c;

    public a(long j3, long j10, String str) {
        this.f46041a = str;
        this.f46042b = j3;
        this.f46043c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46041a.equals(aVar.f46041a) && this.f46042b == aVar.f46042b && this.f46043c == aVar.f46043c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46042b;
        long j10 = this.f46043c;
        return ((((this.f46041a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f46041a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f46042b);
        sb2.append(", tokenCreationTimestamp=");
        return a1.g.s(sb2, this.f46043c, "}");
    }
}
