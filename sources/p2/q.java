package p2;
public final class q {
    public final long f53058a;
    public final long f53059b;

    public q(long j3, long j10) {
        this.f53058a = j3;
        this.f53059b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f53058a == qVar.f53058a && this.f53059b == qVar.f53059b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f53058a) * 31) + ((int) this.f53059b);
    }
}
