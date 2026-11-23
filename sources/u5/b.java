package u5;

import java.util.Set;
public final class b {
    public final long f58465a;
    public final long f58466b;
    public final Set f58467c;

    public b(long j3, long j10, Set set) {
        this.f58465a = j3;
        this.f58466b = j10;
        this.f58467c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f58465a == bVar.f58465a && this.f58466b == bVar.f58466b && this.f58467c.equals(bVar.f58467c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58465a;
        long j10 = this.f58466b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f58467c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f58465a + ", maxAllowedDelay=" + this.f58466b + ", flags=" + this.f58467c + "}";
    }
}
