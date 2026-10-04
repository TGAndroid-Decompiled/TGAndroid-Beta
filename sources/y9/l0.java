package y9;
public final class l0 extends a2 {
    public final long f50709a;
    public final String f50710b;
    public final u1 f50711c;
    public final v1 d;
    public final w1 f50712e;
    public final z1 f50713f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f50709a = j3;
        this.f50710b = str;
        this.f50711c = u1Var;
        this.d = v1Var;
        this.f50712e = w1Var;
        this.f50713f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7905a = Long.valueOf(this.f50709a);
        obj.f7906b = this.f50710b;
        obj.f7907c = this.f50711c;
        obj.d = this.d;
        obj.f7908e = this.f50712e;
        obj.f7909f = this.f50713f;
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
            z1 z1Var2 = l0Var.f50713f;
            w1 w1Var2 = l0Var.f50712e;
            if (this.f50709a == l0Var.f50709a && this.f50710b.equals(l0Var.f50710b) && this.f50711c.equals(l0Var.f50711c) && this.d.equals(l0Var.d) && ((w1Var = this.f50712e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f50713f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f50709a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f50710b.hashCode()) * 1000003) ^ this.f50711c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f50712e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f50713f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f50709a + ", type=" + this.f50710b + ", app=" + this.f50711c + ", device=" + this.d + ", log=" + this.f50712e + ", rollouts=" + this.f50713f + "}";
    }
}
