package r5;

import java.util.Set;
public final class b {
    public final long f42313a;
    public final long f42314b;
    public final Set f42315c;

    public b(long j3, long j10, Set set) {
        this.f42313a = j3;
        this.f42314b = j10;
        this.f42315c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42313a == bVar.f42313a && this.f42314b == bVar.f42314b && this.f42315c.equals(bVar.f42315c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42313a;
        long j10 = this.f42314b;
        return this.f42315c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42313a + ", maxAllowedDelay=" + this.f42314b + ", flags=" + this.f42315c + "}";
    }
}
