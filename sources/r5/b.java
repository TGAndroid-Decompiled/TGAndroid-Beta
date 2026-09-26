package r5;

import java.util.Set;
public final class b {
    public final long f42326a;
    public final long f42327b;
    public final Set f42328c;

    public b(long j3, long j10, Set set) {
        this.f42326a = j3;
        this.f42327b = j10;
        this.f42328c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42326a == bVar.f42326a && this.f42327b == bVar.f42327b && this.f42328c.equals(bVar.f42328c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42326a;
        long j10 = this.f42327b;
        return this.f42328c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42326a + ", maxAllowedDelay=" + this.f42327b + ", flags=" + this.f42328c + "}";
    }
}
