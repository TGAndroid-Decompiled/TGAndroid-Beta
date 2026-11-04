package t5;

import java.util.Set;
public final class b {
    public final long f54934a;
    public final long f54935b;
    public final Set f54936c;

    public b(long j10, long j11, Set set) {
        this.f54934a = j10;
        this.f54935b = j11;
        this.f54936c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f54934a == bVar.f54934a && this.f54935b == bVar.f54935b && this.f54936c.equals(bVar.f54936c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f54934a;
        long j11 = this.f54935b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f54936c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f54934a + ", maxAllowedDelay=" + this.f54935b + ", flags=" + this.f54936c + "}";
    }
}
