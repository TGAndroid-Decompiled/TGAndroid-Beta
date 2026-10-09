package y9;
public final class l0 extends a2 {
    public final long f51995a;
    public final String f51996b;
    public final u1 f51997c;
    public final v1 d;
    public final w1 f51998e;
    public final z1 f51999f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f51995a = j3;
        this.f51996b = str;
        this.f51997c = u1Var;
        this.d = v1Var;
        this.f51998e = w1Var;
        this.f51999f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7954a = Long.valueOf(this.f51995a);
        obj.f7955b = this.f51996b;
        obj.f7956c = this.f51997c;
        obj.d = this.d;
        obj.f7957e = this.f51998e;
        obj.f7958f = this.f51999f;
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
            z1 z1Var2 = l0Var.f51999f;
            w1 w1Var2 = l0Var.f51998e;
            if (this.f51995a == l0Var.f51995a && this.f51996b.equals(l0Var.f51996b) && this.f51997c.equals(l0Var.f51997c) && this.d.equals(l0Var.d) && ((w1Var = this.f51998e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f51999f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f51995a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f51996b.hashCode()) * 1000003) ^ this.f51997c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f51998e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f51999f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f51995a + ", type=" + this.f51996b + ", app=" + this.f51997c + ", device=" + this.d + ", log=" + this.f51998e + ", rollouts=" + this.f51999f + "}";
    }
}
