package r5;

import java.util.Set;
public final class b {
    public final long f42362a;
    public final long f42363b;
    public final Set f42364c;

    public b(long j3, long j10, Set set) {
        this.f42362a = j3;
        this.f42363b = j10;
        this.f42364c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42362a == bVar.f42362a && this.f42363b == bVar.f42363b && this.f42364c.equals(bVar.f42364c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42362a;
        long j10 = this.f42363b;
        return this.f42364c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42362a + ", maxAllowedDelay=" + this.f42363b + ", flags=" + this.f42364c + "}";
    }
}
