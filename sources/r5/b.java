package r5;

import java.util.Set;
public final class b {
    public final long f44915a;
    public final long f44916b;
    public final Set f44917c;

    public b(long j3, long j10, Set set) {
        this.f44915a = j3;
        this.f44916b = j10;
        this.f44917c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f44915a == bVar.f44915a && this.f44916b == bVar.f44916b && this.f44917c.equals(bVar.f44917c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f44915a;
        long j10 = this.f44916b;
        return this.f44917c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f44915a + ", maxAllowedDelay=" + this.f44916b + ", flags=" + this.f44917c + "}";
    }
}
