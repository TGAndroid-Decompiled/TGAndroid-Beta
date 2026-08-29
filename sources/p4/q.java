package p4;
public final class q {
    public final long f45592a;
    public final long f45593b;

    public q(long j10, long j11) {
        this.f45592a = j10;
        this.f45593b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f45592a == qVar.f45592a && this.f45593b == qVar.f45593b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45592a) * 31) + ((int) this.f45593b);
    }
}
