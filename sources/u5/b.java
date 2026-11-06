package u5;

import java.util.Set;
public final class b {
    public final long f56253a;
    public final long f56254b;
    public final Set f56255c;

    public b(long j3, long j10, Set set) {
        this.f56253a = j3;
        this.f56254b = j10;
        this.f56255c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f56253a == bVar.f56253a && this.f56254b == bVar.f56254b && this.f56255c.equals(bVar.f56255c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f56253a;
        long j10 = this.f56254b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f56255c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f56253a + ", maxAllowedDelay=" + this.f56254b + ", flags=" + this.f56255c + "}";
    }
}
