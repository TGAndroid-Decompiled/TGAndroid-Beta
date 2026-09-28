package r5;

import java.util.Set;
public final class b {
    public final long f42327a;
    public final long f42328b;
    public final Set f42329c;

    public b(long j3, long j10, Set set) {
        this.f42327a = j3;
        this.f42328b = j10;
        this.f42329c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42327a == bVar.f42327a && this.f42328b == bVar.f42328b && this.f42329c.equals(bVar.f42329c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42327a;
        long j10 = this.f42328b;
        return this.f42329c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42327a + ", maxAllowedDelay=" + this.f42328b + ", flags=" + this.f42329c + "}";
    }
}
