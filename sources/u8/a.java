package u8;

import a4.w;
public final class a {
    public final long f49122a;
    public final long f49123b;
    public final long f49124c;

    public a(long j10, long j11, long j12) {
        this.f49122a = j10;
        this.f49123b = j11;
        this.f49124c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49122a == aVar.f49122a && this.f49123b == aVar.f49123b && this.f49124c == aVar.f49124c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f49122a;
        long j11 = this.f49123b;
        long j12 = this.f49124c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f49122a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f49123b);
        sb2.append(", uptimeMillis=");
        return w.p(sb2, this.f49124c, "}");
    }
}
