package r5;

import java.util.Set;
public final class b {
    public final long f41994a;
    public final long f41995b;
    public final Set f41996c;

    public b(long j3, long j10, Set set) {
        this.f41994a = j3;
        this.f41995b = j10;
        this.f41996c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f41994a == bVar.f41994a && this.f41995b == bVar.f41995b && this.f41996c.equals(bVar.f41996c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41994a;
        long j10 = this.f41995b;
        return this.f41996c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f41994a + ", maxAllowedDelay=" + this.f41995b + ", flags=" + this.f41996c + "}";
    }
}
