package r5;

import java.util.Set;
public final class b {
    public final long f45011a;
    public final long f45012b;
    public final Set f45013c;

    public b(long j10, long j11, Set set) {
        this.f45011a = j10;
        this.f45012b = j11;
        this.f45013c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45011a == bVar.f45011a && this.f45012b == bVar.f45012b && this.f45013c.equals(bVar.f45013c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45011a;
        long j11 = this.f45012b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45013c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45011a + ", maxAllowedDelay=" + this.f45012b + ", flags=" + this.f45013c + "}";
    }
}
