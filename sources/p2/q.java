package p2;
public final class q {
    public final long f53034a;
    public final long f53035b;

    public q(long j3, long j10) {
        this.f53034a = j3;
        this.f53035b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f53034a == qVar.f53034a && this.f53035b == qVar.f53035b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f53034a) * 31) + ((int) this.f53035b);
    }
}
