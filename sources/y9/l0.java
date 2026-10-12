package y9;
public final class l0 extends a2 {
    public final long f52221a;
    public final String f52222b;
    public final u1 f52223c;
    public final v1 d;
    public final w1 f52224e;
    public final z1 f52225f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f52221a = j3;
        this.f52222b = str;
        this.f52223c = u1Var;
        this.d = v1Var;
        this.f52224e = w1Var;
        this.f52225f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7950a = Long.valueOf(this.f52221a);
        obj.f7951b = this.f52222b;
        obj.f7952c = this.f52223c;
        obj.d = this.d;
        obj.f7953e = this.f52224e;
        obj.f7954f = this.f52225f;
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
            z1 z1Var2 = l0Var.f52225f;
            w1 w1Var2 = l0Var.f52224e;
            if (this.f52221a == l0Var.f52221a && this.f52222b.equals(l0Var.f52222b) && this.f52223c.equals(l0Var.f52223c) && this.d.equals(l0Var.d) && ((w1Var = this.f52224e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f52225f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52221a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f52222b.hashCode()) * 1000003) ^ this.f52223c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f52224e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f52225f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f52221a + ", type=" + this.f52222b + ", app=" + this.f52223c + ", device=" + this.d + ", log=" + this.f52224e + ", rollouts=" + this.f52225f + "}";
    }
}
