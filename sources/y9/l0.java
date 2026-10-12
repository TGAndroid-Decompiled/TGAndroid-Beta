package y9;
public final class l0 extends a2 {
    public final long f52229a;
    public final String f52230b;
    public final u1 f52231c;
    public final v1 d;
    public final w1 f52232e;
    public final z1 f52233f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f52229a = j3;
        this.f52230b = str;
        this.f52231c = u1Var;
        this.d = v1Var;
        this.f52232e = w1Var;
        this.f52233f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7950a = Long.valueOf(this.f52229a);
        obj.f7951b = this.f52230b;
        obj.f7952c = this.f52231c;
        obj.d = this.d;
        obj.f7953e = this.f52232e;
        obj.f7954f = this.f52233f;
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
            z1 z1Var2 = l0Var.f52233f;
            w1 w1Var2 = l0Var.f52232e;
            if (this.f52229a == l0Var.f52229a && this.f52230b.equals(l0Var.f52230b) && this.f52231c.equals(l0Var.f52231c) && this.d.equals(l0Var.d) && ((w1Var = this.f52232e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f52233f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52229a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f52230b.hashCode()) * 1000003) ^ this.f52231c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f52232e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f52233f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f52229a + ", type=" + this.f52230b + ", app=" + this.f52231c + ", device=" + this.d + ", log=" + this.f52232e + ", rollouts=" + this.f52233f + "}";
    }
}
