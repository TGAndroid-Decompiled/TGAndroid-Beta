package r5;

import java.util.Set;
public final class b {
    public final long f42329a;
    public final long f42330b;
    public final Set f42331c;

    public b(long j3, long j10, Set set) {
        this.f42329a = j3;
        this.f42330b = j10;
        this.f42331c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42329a == bVar.f42329a && this.f42330b == bVar.f42330b && this.f42331c.equals(bVar.f42331c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42329a;
        long j10 = this.f42330b;
        return this.f42331c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42329a + ", maxAllowedDelay=" + this.f42330b + ", flags=" + this.f42331c + "}";
    }
}
