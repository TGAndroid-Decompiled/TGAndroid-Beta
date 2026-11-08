package p2;
public final class q {
    public final long f53152a;
    public final long f53153b;

    public q(long j3, long j10) {
        this.f53152a = j3;
        this.f53153b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f53152a == qVar.f53152a && this.f53153b == qVar.f53153b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f53152a) * 31) + ((int) this.f53153b);
    }
}
