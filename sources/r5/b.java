package r5;

import java.util.Set;
public final class b {
    public final long f46978a;
    public final long f46979b;
    public final Set f46980c;

    public b(long j3, long j10, Set set) {
        this.f46978a = j3;
        this.f46979b = j10;
        this.f46980c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46978a == bVar.f46978a && this.f46979b == bVar.f46979b && this.f46980c.equals(bVar.f46980c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46978a;
        long j10 = this.f46979b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f46980c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f46978a + ", maxAllowedDelay=" + this.f46979b + ", flags=" + this.f46980c + "}";
    }
}
