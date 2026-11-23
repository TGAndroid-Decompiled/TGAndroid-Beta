package p2;
public final class q {
    public final long f55148a;
    public final long f55149b;

    public q(long j3, long j10) {
        this.f55148a = j3;
        this.f55149b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f55148a == qVar.f55148a && this.f55149b == qVar.f55149b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f55148a) * 31) + ((int) this.f55149b);
    }
}
