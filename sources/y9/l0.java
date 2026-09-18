package y9;
public final class l0 extends a2 {
    public final long f46601a;
    public final String f46602b;
    public final u1 f46603c;
    public final v1 d;
    public final w1 e;
    public final z1 f46604f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f46601a = j3;
        this.f46602b = str;
        this.f46603c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f46604f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7336a = Long.valueOf(this.f46601a);
        obj.f7337b = this.f46602b;
        obj.f7338c = this.f46603c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f7339f = this.f46604f;
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
            z1 z1Var2 = l0Var.f46604f;
            w1 w1Var2 = l0Var.e;
            if (this.f46601a == l0Var.f46601a && this.f46602b.equals(l0Var.f46602b) && this.f46603c.equals(l0Var.f46603c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f46604f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f46601a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46602b.hashCode()) * 1000003) ^ this.f46603c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f46604f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f46601a + ", type=" + this.f46602b + ", app=" + this.f46603c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f46604f + "}";
    }
}
