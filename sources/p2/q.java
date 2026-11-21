package p2;
public final class q {
    public final long f55179a;
    public final long f55180b;

    public q(long j3, long j10) {
        this.f55179a = j3;
        this.f55180b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f55179a == qVar.f55179a && this.f55180b == qVar.f55180b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f55179a) * 31) + ((int) this.f55180b);
    }
}
