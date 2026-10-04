package r5;

import java.util.Set;
public final class b {
    public final long f45823a;
    public final long f45824b;
    public final Set f45825c;

    public b(long j3, long j10, Set set) {
        this.f45823a = j3;
        this.f45824b = j10;
        this.f45825c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45823a == bVar.f45823a && this.f45824b == bVar.f45824b && this.f45825c.equals(bVar.f45825c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45823a;
        long j10 = this.f45824b;
        return this.f45825c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45823a + ", maxAllowedDelay=" + this.f45824b + ", flags=" + this.f45825c + "}";
    }
}
