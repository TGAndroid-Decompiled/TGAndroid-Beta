package u5;

import java.util.Set;
public final class b {
    public final long f58545a;
    public final long f58546b;
    public final Set f58547c;

    public b(long j3, long j10, Set set) {
        this.f58545a = j3;
        this.f58546b = j10;
        this.f58547c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f58545a == bVar.f58545a && this.f58546b == bVar.f58546b && this.f58547c.equals(bVar.f58547c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58545a;
        long j10 = this.f58546b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f58547c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f58545a + ", maxAllowedDelay=" + this.f58546b + ", flags=" + this.f58547c + "}";
    }
}
