package r5;

import java.util.Set;
public final class b {
    public final long f43683a;
    public final long f43684b;
    public final Set f43685c;

    public b(long j10, long j11, Set set) {
        this.f43683a = j10;
        this.f43684b = j11;
        this.f43685c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43683a == bVar.f43683a && this.f43684b == bVar.f43684b && this.f43685c.equals(bVar.f43685c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f43683a;
        long j11 = this.f43684b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f43685c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f43683a + ", maxAllowedDelay=" + this.f43684b + ", flags=" + this.f43685c + "}";
    }
}
