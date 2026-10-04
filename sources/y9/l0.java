package y9;
public final class l0 extends a2 {
    public final long f50700a;
    public final String f50701b;
    public final u1 f50702c;
    public final v1 d;
    public final w1 f50703e;
    public final z1 f50704f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f50700a = j3;
        this.f50701b = str;
        this.f50702c = u1Var;
        this.d = v1Var;
        this.f50703e = w1Var;
        this.f50704f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7904a = Long.valueOf(this.f50700a);
        obj.f7905b = this.f50701b;
        obj.f7906c = this.f50702c;
        obj.d = this.d;
        obj.f7907e = this.f50703e;
        obj.f7908f = this.f50704f;
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
            z1 z1Var2 = l0Var.f50704f;
            w1 w1Var2 = l0Var.f50703e;
            if (this.f50700a == l0Var.f50700a && this.f50701b.equals(l0Var.f50701b) && this.f50702c.equals(l0Var.f50702c) && this.d.equals(l0Var.d) && ((w1Var = this.f50703e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f50704f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f50700a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f50701b.hashCode()) * 1000003) ^ this.f50702c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f50703e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f50704f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f50700a + ", type=" + this.f50701b + ", app=" + this.f50702c + ", device=" + this.d + ", log=" + this.f50703e + ", rollouts=" + this.f50704f + "}";
    }
}
