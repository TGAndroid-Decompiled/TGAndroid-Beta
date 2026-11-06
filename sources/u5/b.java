package u5;

import java.util.Set;
public final class b {
    public final long f56252a;
    public final long f56253b;
    public final Set f56254c;

    public b(long j3, long j10, Set set) {
        this.f56252a = j3;
        this.f56253b = j10;
        this.f56254c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f56252a == bVar.f56252a && this.f56253b == bVar.f56253b && this.f56254c.equals(bVar.f56254c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f56252a;
        long j10 = this.f56253b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f56254c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f56252a + ", maxAllowedDelay=" + this.f56253b + ", flags=" + this.f56254c + "}";
    }
}
