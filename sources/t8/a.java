package t8;

import a9.p;

public final class a {

    public final long f48107a;

    public final long f48108b;

    public final long f48109c;

    public a(long j10, long j11, long j12) {
        this.f48107a = j10;
        this.f48108b = j11;
        this.f48109c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48107a == aVar.f48107a && this.f48108b == aVar.f48108b && this.f48109c == aVar.f48109c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48107a;
        long j11 = this.f48108b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f48109c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f48107a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f48108b);
        sb2.append(", uptimeMillis=");
        return p.o(sb2, this.f48109c, "}");
    }
}
