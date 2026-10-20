package z9;
public final class l0 extends a2 {
    public final long f51424a;
    public final String f51425b;
    public final u1 f51426c;
    public final v1 d;
    public final w1 e;
    public final z1 f51427f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f51424a = j10;
        this.f51425b = str;
        this.f51426c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f51427f = z1Var;
    }

    public final com.google.firebase.messaging.l a() {
        ?? obj = new Object();
        obj.f7645a = Long.valueOf(this.f51424a);
        obj.f7646b = this.f51425b;
        obj.f7647c = this.f51426c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f7648f = this.f51427f;
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
            z1 z1Var2 = l0Var.f51427f;
            w1 w1Var2 = l0Var.e;
            if (this.f51424a == l0Var.f51424a && this.f51425b.equals(l0Var.f51425b) && this.f51426c.equals(l0Var.f51426c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f51427f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f51424a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f51425b.hashCode()) * 1000003) ^ this.f51426c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f51427f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f51424a + ", type=" + this.f51425b + ", app=" + this.f51426c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f51427f + "}";
    }
}
