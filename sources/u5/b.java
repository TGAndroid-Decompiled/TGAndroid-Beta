package u5;

import java.util.Set;
public final class b {
    public final long f58420a;
    public final long f58421b;
    public final Set f58422c;

    public b(long j3, long j10, Set set) {
        this.f58420a = j3;
        this.f58421b = j10;
        this.f58422c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f58420a == bVar.f58420a && this.f58421b == bVar.f58421b && this.f58422c.equals(bVar.f58422c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58420a;
        long j10 = this.f58421b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f58422c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f58420a + ", maxAllowedDelay=" + this.f58421b + ", flags=" + this.f58422c + "}";
    }
}
