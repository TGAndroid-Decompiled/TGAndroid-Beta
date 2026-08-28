package s8;
public final class a {
    public final long f47458a;
    public final long f47459b;
    public final long f47460c;

    public a(long j10, long j11, long j12) {
        this.f47458a = j10;
        this.f47459b = j11;
        this.f47460c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47458a == aVar.f47458a && this.f47459b == aVar.f47459b && this.f47460c == aVar.f47460c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f47458a;
        long j11 = this.f47459b;
        long j12 = this.f47460c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f47458a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f47459b);
        sb2.append(", uptimeMillis=");
        return aa.d.q(sb2, this.f47460c, "}");
    }
}
