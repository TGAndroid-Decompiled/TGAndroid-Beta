package u5;

import java.util.Set;
public final class b {
    public final long f58461a;
    public final long f58462b;
    public final Set f58463c;

    public b(long j3, long j10, Set set) {
        this.f58461a = j3;
        this.f58462b = j10;
        this.f58463c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f58461a == bVar.f58461a && this.f58462b == bVar.f58462b && this.f58463c.equals(bVar.f58463c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58461a;
        long j10 = this.f58462b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f58463c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f58461a + ", maxAllowedDelay=" + this.f58462b + ", flags=" + this.f58463c + "}";
    }
}
