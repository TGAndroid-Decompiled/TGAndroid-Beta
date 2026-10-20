package r5;

import java.util.Set;
public final class b {
    public final long f45021a;
    public final long f45022b;
    public final Set f45023c;

    public b(long j10, long j11, Set set) {
        this.f45021a = j10;
        this.f45022b = j11;
        this.f45023c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45021a == bVar.f45021a && this.f45022b == bVar.f45022b && this.f45023c.equals(bVar.f45023c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45021a;
        long j11 = this.f45022b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45023c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45021a + ", maxAllowedDelay=" + this.f45022b + ", flags=" + this.f45023c + "}";
    }
}
