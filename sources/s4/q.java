package s4;
public final class q {
    public final long f44033a;
    public final long f44034b;

    public q(long j10, long j11) {
        this.f44033a = j10;
        this.f44034b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f44033a == qVar.f44033a && this.f44034b == qVar.f44034b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f44033a) * 31) + ((int) this.f44034b);
    }
}
