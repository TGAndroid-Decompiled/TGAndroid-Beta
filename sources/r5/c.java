package r5;

import java.util.Set;
public final class c {
    public final long f46333a;
    public final long f46334b;
    public final Set f46335c;

    public c(long j10, long j11, Set set) {
        this.f46333a = j10;
        this.f46334b = j11;
        this.f46335c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f46333a == cVar.f46333a && this.f46334b == cVar.f46334b && this.f46335c.equals(cVar.f46335c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46333a;
        long j11 = this.f46334b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f46335c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f46333a + ", maxAllowedDelay=" + this.f46334b + ", flags=" + this.f46335c + "}";
    }
}
