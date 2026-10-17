package r5;

import java.util.Set;
public final class b {
    public final long f45039a;
    public final long f45040b;
    public final Set f45041c;

    public b(long j10, long j11, Set set) {
        this.f45039a = j10;
        this.f45040b = j11;
        this.f45041c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45039a == bVar.f45039a && this.f45040b == bVar.f45040b && this.f45041c.equals(bVar.f45041c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45039a;
        long j11 = this.f45040b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45041c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45039a + ", maxAllowedDelay=" + this.f45040b + ", flags=" + this.f45041c + "}";
    }
}
