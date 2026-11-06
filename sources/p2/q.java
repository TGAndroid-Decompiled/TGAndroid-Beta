package p2;
public final class q {
    public final long f53060a;
    public final long f53061b;

    public q(long j3, long j10) {
        this.f53060a = j3;
        this.f53061b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f53060a == qVar.f53060a && this.f53061b == qVar.f53061b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f53060a) * 31) + ((int) this.f53061b);
    }
}
