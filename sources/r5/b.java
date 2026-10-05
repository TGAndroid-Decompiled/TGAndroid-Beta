package r5;

import java.util.Set;
public final class b {
    public final long f45830a;
    public final long f45831b;
    public final Set f45832c;

    public b(long j3, long j10, Set set) {
        this.f45830a = j3;
        this.f45831b = j10;
        this.f45832c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45830a == bVar.f45830a && this.f45831b == bVar.f45831b && this.f45832c.equals(bVar.f45832c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45830a;
        long j10 = this.f45831b;
        return this.f45832c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45830a + ", maxAllowedDelay=" + this.f45831b + ", flags=" + this.f45832c + "}";
    }
}
