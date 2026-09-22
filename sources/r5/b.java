package r5;

import java.util.Set;
public final class b {
    public final long f42038a;
    public final long f42039b;
    public final Set f42040c;

    public b(long j3, long j10, Set set) {
        this.f42038a = j3;
        this.f42039b = j10;
        this.f42040c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42038a == bVar.f42038a && this.f42039b == bVar.f42039b && this.f42040c.equals(bVar.f42040c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42038a;
        long j10 = this.f42039b;
        return this.f42040c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42038a + ", maxAllowedDelay=" + this.f42039b + ", flags=" + this.f42040c + "}";
    }
}
