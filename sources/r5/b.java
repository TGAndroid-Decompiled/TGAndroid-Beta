package r5;

import java.util.Set;
public final class b {
    public final long f47104a;
    public final long f47105b;
    public final Set f47106c;

    public b(long j3, long j10, Set set) {
        this.f47104a = j3;
        this.f47105b = j10;
        this.f47106c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47104a == bVar.f47104a && this.f47105b == bVar.f47105b && this.f47106c.equals(bVar.f47106c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47104a;
        long j10 = this.f47105b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47106c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f47104a + ", maxAllowedDelay=" + this.f47105b + ", flags=" + this.f47106c + "}";
    }
}
