package s4;
public final class q {
    public final long f47032a;
    public final long f47033b;

    public q(long j10, long j11) {
        this.f47032a = j10;
        this.f47033b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f47032a == qVar.f47032a && this.f47033b == qVar.f47033b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f47032a) * 31) + ((int) this.f47033b);
    }
}
