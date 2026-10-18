package r5;

import java.util.Set;
public final class b {
    public final long f45013a;
    public final long f45014b;
    public final Set f45015c;

    public b(long j10, long j11, Set set) {
        this.f45013a = j10;
        this.f45014b = j11;
        this.f45015c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45013a == bVar.f45013a && this.f45014b == bVar.f45014b && this.f45015c.equals(bVar.f45015c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45013a;
        long j11 = this.f45014b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45015c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45013a + ", maxAllowedDelay=" + this.f45014b + ", flags=" + this.f45015c + "}";
    }
}
