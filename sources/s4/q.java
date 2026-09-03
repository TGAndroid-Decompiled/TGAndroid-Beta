package s4;
public final class q {
    public final long f44098a;
    public final long f44099b;

    public q(long j10, long j11) {
        this.f44098a = j10;
        this.f44099b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f44098a == qVar.f44098a && this.f44099b == qVar.f44099b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f44098a) * 31) + ((int) this.f44099b);
    }
}
