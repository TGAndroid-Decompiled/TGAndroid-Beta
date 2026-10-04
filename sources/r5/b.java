package r5;

import java.util.Set;
public final class b {
    public final long f45815a;
    public final long f45816b;
    public final Set f45817c;

    public b(long j3, long j10, Set set) {
        this.f45815a = j3;
        this.f45816b = j10;
        this.f45817c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45815a == bVar.f45815a && this.f45816b == bVar.f45816b && this.f45817c.equals(bVar.f45817c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45815a;
        long j10 = this.f45816b;
        return this.f45817c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45815a + ", maxAllowedDelay=" + this.f45816b + ", flags=" + this.f45817c + "}";
    }
}
