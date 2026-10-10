package r5;

import java.util.Set;
public final class b {
    public final long f47024a;
    public final long f47025b;
    public final Set f47026c;

    public b(long j3, long j10, Set set) {
        this.f47024a = j3;
        this.f47025b = j10;
        this.f47026c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47024a == bVar.f47024a && this.f47025b == bVar.f47025b && this.f47026c.equals(bVar.f47026c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47024a;
        long j10 = this.f47025b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47026c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f47024a + ", maxAllowedDelay=" + this.f47025b + ", flags=" + this.f47026c + "}";
    }
}
