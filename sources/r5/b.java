package r5;

import java.util.Set;
public final class b {
    public final long f45437a;
    public final long f45438b;
    public final Set f45439c;

    public b(long j10, long j11, Set set) {
        this.f45437a = j10;
        this.f45438b = j11;
        this.f45439c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45437a == bVar.f45437a && this.f45438b == bVar.f45438b && this.f45439c.equals(bVar.f45439c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45437a;
        long j11 = this.f45438b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45439c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45437a + ", maxAllowedDelay=" + this.f45438b + ", flags=" + this.f45439c + "}";
    }
}
