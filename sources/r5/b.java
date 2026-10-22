package r5;

import java.util.Set;
public final class b {
    public final long f45024a;
    public final long f45025b;
    public final Set f45026c;

    public b(long j10, long j11, Set set) {
        this.f45024a = j10;
        this.f45025b = j11;
        this.f45026c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45024a == bVar.f45024a && this.f45025b == bVar.f45025b && this.f45026c.equals(bVar.f45026c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45024a;
        long j11 = this.f45025b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45026c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45024a + ", maxAllowedDelay=" + this.f45025b + ", flags=" + this.f45026c + "}";
    }
}
