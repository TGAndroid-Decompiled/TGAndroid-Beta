package r5;

import java.util.Set;
public final class c {
    public final long f46322a;
    public final long f46323b;
    public final Set f46324c;

    public c(long j10, long j11, Set set) {
        this.f46322a = j10;
        this.f46323b = j11;
        this.f46324c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f46322a == cVar.f46322a && this.f46323b == cVar.f46323b && this.f46324c.equals(cVar.f46324c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46322a;
        long j11 = this.f46323b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f46324c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f46322a + ", maxAllowedDelay=" + this.f46323b + ", flags=" + this.f46324c + "}";
    }
}
