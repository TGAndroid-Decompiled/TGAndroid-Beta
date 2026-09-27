package r5;

import java.util.Set;
public final class b {
    public final long f42372a;
    public final long f42373b;
    public final Set f42374c;

    public b(long j3, long j10, Set set) {
        this.f42372a = j3;
        this.f42373b = j10;
        this.f42374c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42372a == bVar.f42372a && this.f42373b == bVar.f42373b && this.f42374c.equals(bVar.f42374c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42372a;
        long j10 = this.f42373b;
        return this.f42374c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42372a + ", maxAllowedDelay=" + this.f42373b + ", flags=" + this.f42374c + "}";
    }
}
