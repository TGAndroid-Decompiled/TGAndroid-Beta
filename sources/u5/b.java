package u5;

import java.util.Set;
public final class b {
    public final long f56341a;
    public final long f56342b;
    public final Set f56343c;

    public b(long j3, long j10, Set set) {
        this.f56341a = j3;
        this.f56342b = j10;
        this.f56343c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f56341a == bVar.f56341a && this.f56342b == bVar.f56342b && this.f56343c.equals(bVar.f56343c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f56341a;
        long j10 = this.f56342b;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f56343c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f56341a + ", maxAllowedDelay=" + this.f56342b + ", flags=" + this.f56343c + "}";
    }
}
