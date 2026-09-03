package w8;
public final class a {
    public final long f49479a;
    public final long f49480b;
    public final long f49481c;

    public a(long j10, long j11, long j12) {
        this.f49479a = j10;
        this.f49480b = j11;
        this.f49481c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49479a == aVar.f49479a && this.f49480b == aVar.f49480b && this.f49481c == aVar.f49481c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f49479a;
        long j11 = this.f49480b;
        long j12 = this.f49481c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f49479a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f49480b);
        sb.append(", uptimeMillis=");
        return android.support.v4.media.a.q(sb, this.f49481c, "}");
    }
}
