package p2;
public final class q {
    public final long f53151a;
    public final long f53152b;

    public q(long j3, long j10) {
        this.f53151a = j3;
        this.f53152b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f53151a == qVar.f53151a && this.f53152b == qVar.f53152b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f53151a) * 31) + ((int) this.f53152b);
    }
}
