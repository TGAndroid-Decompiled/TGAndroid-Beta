package s5;

import java.util.Set;
public final class b {
    public final long f47913a;
    public final long f47914b;
    public final Set f47915c;

    public b(long j10, long j11, Set set) {
        this.f47913a = j10;
        this.f47914b = j11;
        this.f47915c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47913a == bVar.f47913a && this.f47914b == bVar.f47914b && this.f47915c.equals(bVar.f47915c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f47913a;
        long j11 = this.f47914b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f47915c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f47913a + ", maxAllowedDelay=" + this.f47914b + ", flags=" + this.f47915c + "}";
    }
}
