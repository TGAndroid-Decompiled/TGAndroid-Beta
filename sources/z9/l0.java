package z9;
public final class l0 extends a2 {
    public final long f55354a;
    public final String f55355b;
    public final u1 f55356c;
    public final v1 d;
    public final w1 e;
    public final z1 f55357f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f55354a = j10;
        this.f55355b = str;
        this.f55356c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f55357f = z1Var;
    }

    public final j2.f a() {
        ?? obj = new Object();
        obj.f9348a = Long.valueOf(this.f55354a);
        obj.f9349b = this.f55355b;
        obj.f9350c = this.f55356c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f9351f = this.f55357f;
        return obj;
    }

    public final boolean equals(Object obj) {
        w1 w1Var;
        z1 z1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            l0 l0Var = (l0) ((a2) obj);
            z1 z1Var2 = l0Var.f55357f;
            w1 w1Var2 = l0Var.e;
            if (this.f55354a == l0Var.f55354a && this.f55355b.equals(l0Var.f55355b) && this.f55356c.equals(l0Var.f55356c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f55357f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f55354a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f55355b.hashCode()) * 1000003) ^ this.f55356c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f55357f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f55354a + ", type=" + this.f55355b + ", app=" + this.f55356c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f55357f + "}";
    }
}
