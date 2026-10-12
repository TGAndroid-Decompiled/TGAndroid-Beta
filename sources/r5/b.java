package r5;

import java.util.Set;
public final class b {
    public final long f43924a;
    public final long f43925b;
    public final Set f43926c;

    public b(long j10, long j11, Set set) {
        this.f43924a = j10;
        this.f43925b = j11;
        this.f43926c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43924a == bVar.f43924a && this.f43925b == bVar.f43925b && this.f43926c.equals(bVar.f43926c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f43924a;
        long j11 = this.f43925b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f43926c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f43924a + ", maxAllowedDelay=" + this.f43925b + ", flags=" + this.f43926c + "}";
    }
}
