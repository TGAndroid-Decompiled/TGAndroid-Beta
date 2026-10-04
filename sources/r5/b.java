package r5;

import java.util.Set;
public final class b {
    public final long f45816a;
    public final long f45817b;
    public final Set f45818c;

    public b(long j3, long j10, Set set) {
        this.f45816a = j3;
        this.f45817b = j10;
        this.f45818c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45816a == bVar.f45816a && this.f45817b == bVar.f45817b && this.f45818c.equals(bVar.f45818c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45816a;
        long j10 = this.f45817b;
        return this.f45818c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45816a + ", maxAllowedDelay=" + this.f45817b + ", flags=" + this.f45818c + "}";
    }
}
