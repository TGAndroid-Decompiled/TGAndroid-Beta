package r5;

import java.util.Set;
public final class b {
    public final long f42042a;
    public final long f42043b;
    public final Set f42044c;

    public b(long j3, long j10, Set set) {
        this.f42042a = j3;
        this.f42043b = j10;
        this.f42044c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42042a == bVar.f42042a && this.f42043b == bVar.f42043b && this.f42044c.equals(bVar.f42044c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42042a;
        long j10 = this.f42043b;
        return this.f42044c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42042a + ", maxAllowedDelay=" + this.f42043b + ", flags=" + this.f42044c + "}";
    }
}
