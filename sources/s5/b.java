package s5;

import java.util.Set;
public final class b {
    public final long f47878a;
    public final long f47879b;
    public final Set f47880c;

    public b(long j10, long j11, Set set) {
        this.f47878a = j10;
        this.f47879b = j11;
        this.f47880c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47878a == bVar.f47878a && this.f47879b == bVar.f47879b && this.f47880c.equals(bVar.f47880c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f47878a;
        long j11 = this.f47879b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f47880c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f47878a + ", maxAllowedDelay=" + this.f47879b + ", flags=" + this.f47880c + "}";
    }
}
