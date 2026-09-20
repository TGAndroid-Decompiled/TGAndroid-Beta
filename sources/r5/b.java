package r5;

import java.util.Set;
public final class b {
    public final long f42341a;
    public final long f42342b;
    public final Set f42343c;

    public b(long j3, long j10, Set set) {
        this.f42341a = j3;
        this.f42342b = j10;
        this.f42343c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42341a == bVar.f42341a && this.f42342b == bVar.f42342b && this.f42343c.equals(bVar.f42343c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42341a;
        long j10 = this.f42342b;
        return this.f42343c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f42341a + ", maxAllowedDelay=" + this.f42342b + ", flags=" + this.f42343c + "}";
    }
}
