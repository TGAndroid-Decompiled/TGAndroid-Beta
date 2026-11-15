package p2;
public final class q {
    public final long f54569a;
    public final long f54570b;

    public q(long j3, long j10) {
        this.f54569a = j3;
        this.f54570b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f54569a == qVar.f54569a && this.f54570b == qVar.f54570b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f54569a) * 31) + ((int) this.f54570b);
    }
}
