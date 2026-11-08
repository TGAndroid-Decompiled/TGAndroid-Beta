package u5;

import java.util.Set;
public final class b {
    public final long f56342a;
    public final long f56343b;
    public final Set f56344c;

    public b(long j3, long j10, Set set) {
        this.f56342a = j3;
        this.f56343b = j10;
        this.f56344c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f56342a == bVar.f56342a && this.f56343b == bVar.f56343b && this.f56344c.equals(bVar.f56344c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f56342a;
        long j10 = this.f56343b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f56344c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f56342a + ", maxAllowedDelay=" + this.f56343b + ", flags=" + this.f56344c + "}";
    }
}
