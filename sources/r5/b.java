package r5;

import java.util.Set;
public final class b {
    public final long f47070a;
    public final long f47071b;
    public final Set f47072c;

    public b(long j3, long j10, Set set) {
        this.f47070a = j3;
        this.f47071b = j10;
        this.f47072c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47070a == bVar.f47070a && this.f47071b == bVar.f47071b && this.f47072c.equals(bVar.f47072c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47070a;
        long j10 = this.f47071b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f47072c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f47070a + ", maxAllowedDelay=" + this.f47071b + ", flags=" + this.f47072c + "}";
    }
}
