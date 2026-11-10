package p2;
public final class q {
    public final long f53163a;
    public final long f53164b;

    public q(long j3, long j10) {
        this.f53163a = j3;
        this.f53164b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f53163a == qVar.f53163a && this.f53164b == qVar.f53164b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f53163a) * 31) + ((int) this.f53164b);
    }
}
