package y9;
public final class l0 extends a2 {
    public final long f52041a;
    public final String f52042b;
    public final u1 f52043c;
    public final v1 d;
    public final w1 f52044e;
    public final z1 f52045f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f52041a = j3;
        this.f52042b = str;
        this.f52043c = u1Var;
        this.d = v1Var;
        this.f52044e = w1Var;
        this.f52045f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7954a = Long.valueOf(this.f52041a);
        obj.f7955b = this.f52042b;
        obj.f7956c = this.f52043c;
        obj.d = this.d;
        obj.f7957e = this.f52044e;
        obj.f7958f = this.f52045f;
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
            z1 z1Var2 = l0Var.f52045f;
            w1 w1Var2 = l0Var.f52044e;
            if (this.f52041a == l0Var.f52041a && this.f52042b.equals(l0Var.f52042b) && this.f52043c.equals(l0Var.f52043c) && this.d.equals(l0Var.d) && ((w1Var = this.f52044e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f52045f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52041a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f52042b.hashCode()) * 1000003) ^ this.f52043c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f52044e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f52045f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f52041a + ", type=" + this.f52042b + ", app=" + this.f52043c + ", device=" + this.d + ", log=" + this.f52044e + ", rollouts=" + this.f52045f + "}";
    }
}
