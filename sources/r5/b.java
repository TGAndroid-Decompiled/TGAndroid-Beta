package r5;

import java.util.Set;
public final class b {
    public final long f47202a;
    public final long f47203b;
    public final Set f47204c;

    public b(long j3, long j10, Set set) {
        this.f47202a = j3;
        this.f47203b = j10;
        this.f47204c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47202a == bVar.f47202a && this.f47203b == bVar.f47203b && this.f47204c.equals(bVar.f47204c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47202a;
        long j10 = this.f47203b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47204c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f47202a + ", maxAllowedDelay=" + this.f47203b + ", flags=" + this.f47204c + "}";
    }
}
