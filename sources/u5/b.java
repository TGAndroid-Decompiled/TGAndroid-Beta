package u5;

import java.util.Set;
public final class b {
    public final long f56354a;
    public final long f56355b;
    public final Set f56356c;

    public b(long j3, long j10, Set set) {
        this.f56354a = j3;
        this.f56355b = j10;
        this.f56356c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f56354a == bVar.f56354a && this.f56355b == bVar.f56355b && this.f56356c.equals(bVar.f56356c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f56354a;
        long j10 = this.f56355b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f56356c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f56354a + ", maxAllowedDelay=" + this.f56355b + ", flags=" + this.f56356c + "}";
    }
}
