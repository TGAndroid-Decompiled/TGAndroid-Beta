package r5;

import java.util.Set;
public final class b {
    public final long f42069a;
    public final long f42070b;
    public final Set f42071c;

    public b(long j3, long j10, Set set) {
        this.f42069a = j3;
        this.f42070b = j10;
        this.f42071c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42069a == bVar.f42069a && this.f42070b == bVar.f42070b && this.f42071c.equals(bVar.f42071c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42069a;
        long j10 = this.f42070b;
        return this.f42071c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42069a + ", maxAllowedDelay=" + this.f42070b + ", flags=" + this.f42071c + "}";
    }
}
