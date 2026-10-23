package r5;

import java.util.Set;
public final class b {
    public final long f45025a;
    public final long f45026b;
    public final Set f45027c;

    public b(long j10, long j11, Set set) {
        this.f45025a = j10;
        this.f45026b = j11;
        this.f45027c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45025a == bVar.f45025a && this.f45026b == bVar.f45026b && this.f45027c.equals(bVar.f45027c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45025a;
        long j11 = this.f45026b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45027c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45025a + ", maxAllowedDelay=" + this.f45026b + ", flags=" + this.f45027c + "}";
    }
}
