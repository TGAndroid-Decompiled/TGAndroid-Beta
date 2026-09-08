package y9;
public final class l0 extends a2 {
    public final long f49848a;
    public final String f49849b;
    public final u1 f49850c;
    public final v1 d;
    public final w1 f49851e;
    public final z1 f49852f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f49848a = j3;
        this.f49849b = str;
        this.f49850c = u1Var;
        this.d = v1Var;
        this.f49851e = w1Var;
        this.f49852f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f6401a = Long.valueOf(this.f49848a);
        obj.f6402b = this.f49849b;
        obj.f6403c = this.f49850c;
        obj.d = this.d;
        obj.f6404e = this.f49851e;
        obj.f6405f = this.f49852f;
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
            z1 z1Var2 = l0Var.f49852f;
            w1 w1Var2 = l0Var.f49851e;
            if (this.f49848a == l0Var.f49848a && this.f49849b.equals(l0Var.f49849b) && this.f49850c.equals(l0Var.f49850c) && this.d.equals(l0Var.d) && ((w1Var = this.f49851e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f49852f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49848a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f49849b.hashCode()) * 1000003) ^ this.f49850c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f49851e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f49852f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f49848a + ", type=" + this.f49849b + ", app=" + this.f49850c + ", device=" + this.d + ", log=" + this.f49851e + ", rollouts=" + this.f49852f + "}";
    }
}
