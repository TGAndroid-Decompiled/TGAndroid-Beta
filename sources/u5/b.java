package u5;

import java.util.Set;
public final class b {
    public final long f58419a;
    public final long f58420b;
    public final Set f58421c;

    public b(long j3, long j10, Set set) {
        this.f58419a = j3;
        this.f58420b = j10;
        this.f58421c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f58419a == bVar.f58419a && this.f58420b == bVar.f58420b && this.f58421c.equals(bVar.f58421c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58419a;
        long j10 = this.f58420b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f58421c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f58419a + ", maxAllowedDelay=" + this.f58420b + ", flags=" + this.f58421c + "}";
    }
}
