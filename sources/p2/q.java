package p2;
public final class q {
    public final long f55264a;
    public final long f55265b;

    public q(long j3, long j10) {
        this.f55264a = j3;
        this.f55265b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f55264a == qVar.f55264a && this.f55265b == qVar.f55265b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f55264a) * 31) + ((int) this.f55265b);
    }
}
