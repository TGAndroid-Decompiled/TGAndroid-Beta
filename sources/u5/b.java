package u5;

import java.util.Set;
public final class b {
    public final long f58430a;
    public final long f58431b;
    public final Set f58432c;

    public b(long j3, long j10, Set set) {
        this.f58430a = j3;
        this.f58431b = j10;
        this.f58432c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f58430a == bVar.f58430a && this.f58431b == bVar.f58431b && this.f58432c.equals(bVar.f58432c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58430a;
        long j10 = this.f58431b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f58432c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f58430a + ", maxAllowedDelay=" + this.f58431b + ", flags=" + this.f58432c + "}";
    }
}
