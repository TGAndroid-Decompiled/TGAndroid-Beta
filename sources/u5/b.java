package u5;

import java.util.Set;
public final class b {
    public final long f56228a;
    public final long f56229b;
    public final Set f56230c;

    public b(long j3, long j10, Set set) {
        this.f56228a = j3;
        this.f56229b = j10;
        this.f56230c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f56228a == bVar.f56228a && this.f56229b == bVar.f56229b && this.f56230c.equals(bVar.f56230c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f56228a;
        long j10 = this.f56229b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f56230c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f56228a + ", maxAllowedDelay=" + this.f56229b + ", flags=" + this.f56230c + "}";
    }
}
