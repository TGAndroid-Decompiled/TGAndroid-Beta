package r5;

import java.util.Set;
public final class b {
    public final long f42064a;
    public final long f42065b;
    public final Set f42066c;

    public b(long j3, long j10, Set set) {
        this.f42064a = j3;
        this.f42065b = j10;
        this.f42066c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42064a == bVar.f42064a && this.f42065b == bVar.f42065b && this.f42066c.equals(bVar.f42066c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42064a;
        long j10 = this.f42065b;
        return this.f42066c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42064a + ", maxAllowedDelay=" + this.f42065b + ", flags=" + this.f42066c + "}";
    }
}
