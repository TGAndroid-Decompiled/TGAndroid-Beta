package r5;

import java.util.Set;
public final class b {
    public final long f42432a;
    public final long f42433b;
    public final Set f42434c;

    public b(long j3, long j10, Set set) {
        this.f42432a = j3;
        this.f42433b = j10;
        this.f42434c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42432a == bVar.f42432a && this.f42433b == bVar.f42433b && this.f42434c.equals(bVar.f42434c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42432a;
        long j10 = this.f42433b;
        return this.f42434c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42432a + ", maxAllowedDelay=" + this.f42433b + ", flags=" + this.f42434c + "}";
    }
}
