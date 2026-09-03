package w8;
public final class a {
    public final long f46551a;
    public final long f46552b;
    public final long f46553c;

    public a(long j10, long j11, long j12) {
        this.f46551a = j10;
        this.f46552b = j11;
        this.f46553c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46551a == aVar.f46551a && this.f46552b == aVar.f46552b && this.f46553c == aVar.f46553c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46551a;
        long j11 = this.f46552b;
        long j12 = this.f46553c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f46551a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f46552b);
        sb.append(", uptimeMillis=");
        return android.support.v4.media.a.q(sb, this.f46553c, "}");
    }
}
