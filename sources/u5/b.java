package u5;

import java.util.Set;
public final class b {
    public final long f57852a;
    public final long f57853b;
    public final Set f57854c;

    public b(long j3, long j10, Set set) {
        this.f57852a = j3;
        this.f57853b = j10;
        this.f57854c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f57852a == bVar.f57852a && this.f57853b == bVar.f57853b && this.f57854c.equals(bVar.f57854c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57852a;
        long j10 = this.f57853b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f57854c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f57852a + ", maxAllowedDelay=" + this.f57853b + ", flags=" + this.f57854c + "}";
    }
}
