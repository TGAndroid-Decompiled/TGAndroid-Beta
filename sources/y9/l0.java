package y9;
public final class l0 extends a2 {
    public final long f51997a;
    public final String f51998b;
    public final u1 f51999c;
    public final v1 d;
    public final w1 f52000e;
    public final z1 f52001f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f51997a = j3;
        this.f51998b = str;
        this.f51999c = u1Var;
        this.d = v1Var;
        this.f52000e = w1Var;
        this.f52001f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7954a = Long.valueOf(this.f51997a);
        obj.f7955b = this.f51998b;
        obj.f7956c = this.f51999c;
        obj.d = this.d;
        obj.f7957e = this.f52000e;
        obj.f7958f = this.f52001f;
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
            z1 z1Var2 = l0Var.f52001f;
            w1 w1Var2 = l0Var.f52000e;
            if (this.f51997a == l0Var.f51997a && this.f51998b.equals(l0Var.f51998b) && this.f51999c.equals(l0Var.f51999c) && this.d.equals(l0Var.d) && ((w1Var = this.f52000e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f52001f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f51997a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f51998b.hashCode()) * 1000003) ^ this.f51999c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f52000e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f52001f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f51997a + ", type=" + this.f51998b + ", app=" + this.f51999c + ", device=" + this.d + ", log=" + this.f52000e + ", rollouts=" + this.f52001f + "}";
    }
}
