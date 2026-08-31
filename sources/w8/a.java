package w8;
public final class a {
    public final long f49442a;
    public final long f49443b;
    public final long f49444c;

    public a(long j10, long j11, long j12) {
        this.f49442a = j10;
        this.f49443b = j11;
        this.f49444c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49442a == aVar.f49442a && this.f49443b == aVar.f49443b && this.f49444c == aVar.f49444c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f49442a;
        long j11 = this.f49443b;
        long j12 = this.f49444c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f49442a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f49443b);
        sb.append(", uptimeMillis=");
        return android.support.v4.media.a.q(sb, this.f49444c, "}");
    }
}
