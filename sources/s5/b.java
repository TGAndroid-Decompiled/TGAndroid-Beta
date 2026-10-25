package s5;

import java.util.Set;
public final class b {
    public final long f47875a;
    public final long f47876b;
    public final Set f47877c;

    public b(long j10, long j11, Set set) {
        this.f47875a = j10;
        this.f47876b = j11;
        this.f47877c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47875a == bVar.f47875a && this.f47876b == bVar.f47876b && this.f47877c.equals(bVar.f47877c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f47875a;
        long j11 = this.f47876b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f47877c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f47875a + ", maxAllowedDelay=" + this.f47876b + ", flags=" + this.f47877c + "}";
    }
}
