package u5;

import java.util.Set;
public final class b {
    public final long f56353a;
    public final long f56354b;
    public final Set f56355c;

    public b(long j3, long j10, Set set) {
        this.f56353a = j3;
        this.f56354b = j10;
        this.f56355c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f56353a == bVar.f56353a && this.f56354b == bVar.f56354b && this.f56355c.equals(bVar.f56355c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f56353a;
        long j10 = this.f56354b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f56355c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f56353a + ", maxAllowedDelay=" + this.f56354b + ", flags=" + this.f56355c + "}";
    }
}
