package y9;
public final class l0 extends a2 {
    public final long f49820a;
    public final String f49821b;
    public final u1 f49822c;
    public final v1 d;
    public final w1 f49823e;
    public final z1 f49824f;

    public l0(long j3, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f49820a = j3;
        this.f49821b = str;
        this.f49822c = u1Var;
        this.d = v1Var;
        this.f49823e = w1Var;
        this.f49824f = z1Var;
    }

    public final com.google.firebase.messaging.n a() {
        ?? obj = new Object();
        obj.f6374a = Long.valueOf(this.f49820a);
        obj.f6375b = this.f49821b;
        obj.f6376c = this.f49822c;
        obj.d = this.d;
        obj.f6377e = this.f49823e;
        obj.f6378f = this.f49824f;
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
            z1 z1Var2 = l0Var.f49824f;
            w1 w1Var2 = l0Var.f49823e;
            if (this.f49820a == l0Var.f49820a && this.f49821b.equals(l0Var.f49821b) && this.f49822c.equals(l0Var.f49822c) && this.d.equals(l0Var.d) && ((w1Var = this.f49823e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f49824f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49820a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f49821b.hashCode()) * 1000003) ^ this.f49822c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f49823e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f49824f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f49820a + ", type=" + this.f49821b + ", app=" + this.f49822c + ", device=" + this.d + ", log=" + this.f49823e + ", rollouts=" + this.f49824f + "}";
    }
}
