package s4;
public final class q {
    public final long f47001a;
    public final long f47002b;

    public q(long j10, long j11) {
        this.f47001a = j10;
        this.f47002b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f47001a == qVar.f47001a && this.f47002b == qVar.f47002b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f47001a) * 31) + ((int) this.f47002b);
    }
}
