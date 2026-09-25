package r5;

import java.util.Set;
public final class b {
    public final long f42328a;
    public final long f42329b;
    public final Set f42330c;

    public b(long j3, long j10, Set set) {
        this.f42328a = j3;
        this.f42329b = j10;
        this.f42330c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42328a == bVar.f42328a && this.f42329b == bVar.f42329b && this.f42330c.equals(bVar.f42330c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42328a;
        long j10 = this.f42329b;
        return this.f42330c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42328a + ", maxAllowedDelay=" + this.f42329b + ", flags=" + this.f42330c + "}";
    }
}
