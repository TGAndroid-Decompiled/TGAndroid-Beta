package y9;
public final class l0 extends a2 {
    public final long f46897a;
    public final String f46898b;
    public final u1 f46899c;
    public final v1 d;
    public final w1 e;
    public final z1 f46900f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f46897a = j3;
        this.f46898b = str;
        this.f46899c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f46900f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7320a = Long.valueOf(this.f46897a);
        obj.f7321b = this.f46898b;
        obj.f7322c = this.f46899c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f7323f = this.f46900f;
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
            z1 z1Var2 = l0Var.f46900f;
            w1 w1Var2 = l0Var.e;
            if (this.f46897a == l0Var.f46897a && this.f46898b.equals(l0Var.f46898b) && this.f46899c.equals(l0Var.f46899c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f46900f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f46897a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46898b.hashCode()) * 1000003) ^ this.f46899c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f46900f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f46897a + ", type=" + this.f46898b + ", app=" + this.f46899c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f46900f + "}";
    }
}
