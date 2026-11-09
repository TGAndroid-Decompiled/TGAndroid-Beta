package p2;
public final class q {
    public final long f53164a;
    public final long f53165b;

    public q(long j3, long j10) {
        this.f53164a = j3;
        this.f53165b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f53164a == qVar.f53164a && this.f53165b == qVar.f53165b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f53164a) * 31) + ((int) this.f53165b);
    }
}
