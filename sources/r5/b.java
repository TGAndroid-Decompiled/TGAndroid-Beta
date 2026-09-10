package r5;

import java.util.Set;
public final class b {
    public final long f41261a;
    public final long f41262b;
    public final Set f41263c;

    public b(long j3, long j10, Set set) {
        this.f41261a = j3;
        this.f41262b = j10;
        this.f41263c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f41261a == bVar.f41261a && this.f41262b == bVar.f41262b && this.f41263c.equals(bVar.f41263c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41261a;
        long j10 = this.f41262b;
        return this.f41263c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f41261a + ", maxAllowedDelay=" + this.f41262b + ", flags=" + this.f41263c + "}";
    }
}
