package r5;

import java.util.Set;
public final class b {
    public final long f44916a;
    public final long f44917b;
    public final Set f44918c;

    public b(long j3, long j10, Set set) {
        this.f44916a = j3;
        this.f44917b = j10;
        this.f44918c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f44916a == bVar.f44916a && this.f44917b == bVar.f44917b && this.f44918c.equals(bVar.f44918c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44916a;
        long j10 = this.f44917b;
        return this.f44918c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f44916a + ", maxAllowedDelay=" + this.f44917b + ", flags=" + this.f44918c + "}";
    }
}
