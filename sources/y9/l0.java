package y9;
public final class l0 extends a2 {
    public final long f49819a;
    public final String f49820b;
    public final u1 f49821c;
    public final v1 d;
    public final w1 f49822e;
    public final z1 f49823f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f49819a = j3;
        this.f49820b = str;
        this.f49821c = u1Var;
        this.d = v1Var;
        this.f49822e = w1Var;
        this.f49823f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f6374a = Long.valueOf(this.f49819a);
        obj.f6375b = this.f49820b;
        obj.f6376c = this.f49821c;
        obj.d = this.d;
        obj.f6377e = this.f49822e;
        obj.f6378f = this.f49823f;
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
            z1 z1Var2 = l0Var.f49823f;
            w1 w1Var2 = l0Var.f49822e;
            if (this.f49819a == l0Var.f49819a && this.f49820b.equals(l0Var.f49820b) && this.f49821c.equals(l0Var.f49821c) && this.d.equals(l0Var.d) && ((w1Var = this.f49822e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f49823f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49819a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f49820b.hashCode()) * 1000003) ^ this.f49821c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f49822e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f49823f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f49819a + ", type=" + this.f49820b + ", app=" + this.f49821c + ", device=" + this.d + ", log=" + this.f49822e + ", rollouts=" + this.f49823f + "}";
    }
}
