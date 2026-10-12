package r5;

import java.util.Set;
public final class b {
    public final long f47194a;
    public final long f47195b;
    public final Set f47196c;

    public b(long j3, long j10, Set set) {
        this.f47194a = j3;
        this.f47195b = j10;
        this.f47196c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47194a == bVar.f47194a && this.f47195b == bVar.f47195b && this.f47196c.equals(bVar.f47196c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47194a;
        long j10 = this.f47195b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47196c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f47194a + ", maxAllowedDelay=" + this.f47195b + ", flags=" + this.f47196c + "}";
    }
}
