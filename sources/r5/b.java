package r5;

import java.util.Set;
public final class b {
    public final long f44943a;
    public final long f44944b;
    public final Set f44945c;

    public b(long j3, long j10, Set set) {
        this.f44943a = j3;
        this.f44944b = j10;
        this.f44945c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f44943a == bVar.f44943a && this.f44944b == bVar.f44944b && this.f44945c.equals(bVar.f44945c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44943a;
        long j10 = this.f44944b;
        return this.f44945c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f44943a + ", maxAllowedDelay=" + this.f44944b + ", flags=" + this.f44945c + "}";
    }
}
