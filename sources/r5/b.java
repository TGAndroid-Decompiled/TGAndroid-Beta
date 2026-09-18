package r5;

import java.util.Set;
public final class b {
    public final long f42297a;
    public final long f42298b;
    public final Set f42299c;

    public b(long j3, long j10, Set set) {
        this.f42297a = j3;
        this.f42298b = j10;
        this.f42299c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42297a == bVar.f42297a && this.f42298b == bVar.f42298b && this.f42299c.equals(bVar.f42299c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42297a;
        long j10 = this.f42298b;
        return this.f42299c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42297a + ", maxAllowedDelay=" + this.f42298b + ", flags=" + this.f42299c + "}";
    }
}
