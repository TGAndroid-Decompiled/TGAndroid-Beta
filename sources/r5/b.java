package r5;

import java.util.Set;
public final class b {
    public final long f45436a;
    public final long f45437b;
    public final Set f45438c;

    public b(long j10, long j11, Set set) {
        this.f45436a = j10;
        this.f45437b = j11;
        this.f45438c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45436a == bVar.f45436a && this.f45437b == bVar.f45437b && this.f45438c.equals(bVar.f45438c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45436a;
        long j11 = this.f45437b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f45438c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45436a + ", maxAllowedDelay=" + this.f45437b + ", flags=" + this.f45438c + "}";
    }
}
