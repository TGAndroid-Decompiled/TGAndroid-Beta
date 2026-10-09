package r5;

import java.util.Set;
public final class b {
    public final long f46980a;
    public final long f46981b;
    public final Set f46982c;

    public b(long j3, long j10, Set set) {
        this.f46980a = j3;
        this.f46981b = j10;
        this.f46982c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46980a == bVar.f46980a && this.f46981b == bVar.f46981b && this.f46982c.equals(bVar.f46982c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46980a;
        long j10 = this.f46981b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f46982c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f46980a + ", maxAllowedDelay=" + this.f46981b + ", flags=" + this.f46982c + "}";
    }
}
