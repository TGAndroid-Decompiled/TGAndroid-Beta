package y9;
public final class l0 extends a2 {
    public final long f52118a;
    public final String f52119b;
    public final u1 f52120c;
    public final v1 d;
    public final w1 f52121e;
    public final z1 f52122f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f52118a = j3;
        this.f52119b = str;
        this.f52120c = u1Var;
        this.d = v1Var;
        this.f52121e = w1Var;
        this.f52122f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7953a = Long.valueOf(this.f52118a);
        obj.f7954b = this.f52119b;
        obj.f7955c = this.f52120c;
        obj.d = this.d;
        obj.f7956e = this.f52121e;
        obj.f7957f = this.f52122f;
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
            z1 z1Var2 = l0Var.f52122f;
            w1 w1Var2 = l0Var.f52121e;
            if (this.f52118a == l0Var.f52118a && this.f52119b.equals(l0Var.f52119b) && this.f52120c.equals(l0Var.f52120c) && this.d.equals(l0Var.d) && ((w1Var = this.f52121e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f52122f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52118a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f52119b.hashCode()) * 1000003) ^ this.f52120c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f52121e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f52122f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f52118a + ", type=" + this.f52119b + ", app=" + this.f52120c + ", device=" + this.d + ", log=" + this.f52121e + ", rollouts=" + this.f52122f + "}";
    }
}
