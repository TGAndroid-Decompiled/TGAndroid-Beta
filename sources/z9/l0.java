package z9;
public final class l0 extends a2 {
    public final long f51888a;
    public final String f51889b;
    public final u1 f51890c;
    public final v1 d;
    public final w1 e;
    public final z1 f51891f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f51888a = j10;
        this.f51889b = str;
        this.f51890c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f51891f = z1Var;
    }

    public final com.google.firebase.messaging.l a() {
        ?? obj = new Object();
        obj.f7657a = Long.valueOf(this.f51888a);
        obj.f7658b = this.f51889b;
        obj.f7659c = this.f51890c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f7660f = this.f51891f;
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
            z1 z1Var2 = l0Var.f51891f;
            w1 w1Var2 = l0Var.e;
            if (this.f51888a == l0Var.f51888a && this.f51889b.equals(l0Var.f51889b) && this.f51890c.equals(l0Var.f51890c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f51891f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f51888a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f51889b.hashCode()) * 1000003) ^ this.f51890c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f51891f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f51888a + ", type=" + this.f51889b + ", app=" + this.f51890c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f51891f + "}";
    }
}
