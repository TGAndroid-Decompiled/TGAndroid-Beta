package w8;
public final class a {
    public final long f46469a;
    public final long f46470b;
    public final long f46471c;

    public a(long j10, long j11, long j12) {
        this.f46469a = j10;
        this.f46470b = j11;
        this.f46471c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46469a == aVar.f46469a && this.f46470b == aVar.f46470b && this.f46471c == aVar.f46471c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46469a;
        long j11 = this.f46470b;
        long j12 = this.f46471c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f46469a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f46470b);
        sb.append(", uptimeMillis=");
        return android.support.v4.media.a.q(sb, this.f46471c, "}");
    }
}
