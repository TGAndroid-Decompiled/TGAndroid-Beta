package r5;

import java.util.Set;
public final class b {
    public final long f44944a;
    public final long f44945b;
    public final Set f44946c;

    public b(long j3, long j10, Set set) {
        this.f44944a = j3;
        this.f44945b = j10;
        this.f44946c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f44944a == bVar.f44944a && this.f44945b == bVar.f44945b && this.f44946c.equals(bVar.f44946c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44944a;
        long j10 = this.f44945b;
        return this.f44946c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f44944a + ", maxAllowedDelay=" + this.f44945b + ", flags=" + this.f44946c + "}";
    }
}
