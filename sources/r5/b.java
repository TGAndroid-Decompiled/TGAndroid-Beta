package r5;

import java.util.Set;
public final class b {
    public final long f45059a;
    public final long f45060b;
    public final Set f45061c;

    public b(long j10, long j11, Set set) {
        this.f45059a = j10;
        this.f45060b = j11;
        this.f45061c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45059a == bVar.f45059a && this.f45060b == bVar.f45060b && this.f45061c.equals(bVar.f45061c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45059a;
        long j11 = this.f45060b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45061c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45059a + ", maxAllowedDelay=" + this.f45060b + ", flags=" + this.f45061c + "}";
    }
}
