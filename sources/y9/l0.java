package y9;
public final class l0 extends a2 {
    public final long f52084a;
    public final String f52085b;
    public final u1 f52086c;
    public final v1 d;
    public final w1 f52087e;
    public final z1 f52088f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f52084a = j3;
        this.f52085b = str;
        this.f52086c = u1Var;
        this.d = v1Var;
        this.f52087e = w1Var;
        this.f52088f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f7953a = Long.valueOf(this.f52084a);
        obj.f7954b = this.f52085b;
        obj.f7955c = this.f52086c;
        obj.d = this.d;
        obj.f7956e = this.f52087e;
        obj.f7957f = this.f52088f;
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
            z1 z1Var2 = l0Var.f52088f;
            w1 w1Var2 = l0Var.f52087e;
            if (this.f52084a == l0Var.f52084a && this.f52085b.equals(l0Var.f52085b) && this.f52086c.equals(l0Var.f52086c) && this.d.equals(l0Var.d) && ((w1Var = this.f52087e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f52088f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52084a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f52085b.hashCode()) * 1000003) ^ this.f52086c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f52087e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f52088f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f52084a + ", type=" + this.f52085b + ", app=" + this.f52086c + ", device=" + this.d + ", log=" + this.f52087e + ", rollouts=" + this.f52088f + "}";
    }
}
