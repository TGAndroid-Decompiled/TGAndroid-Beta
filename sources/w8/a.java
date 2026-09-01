package w8;
public final class a {
    public final long f49443a;
    public final long f49444b;
    public final long f49445c;

    public a(long j10, long j11, long j12) {
        this.f49443a = j10;
        this.f49444b = j11;
        this.f49445c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49443a == aVar.f49443a && this.f49444b == aVar.f49444b && this.f49445c == aVar.f49445c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f49443a;
        long j11 = this.f49444b;
        long j12 = this.f49445c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f49443a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f49444b);
        sb.append(", uptimeMillis=");
        return android.support.v4.media.a.q(sb, this.f49445c, "}");
    }
}
