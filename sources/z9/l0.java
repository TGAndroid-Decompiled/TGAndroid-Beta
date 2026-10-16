package z9;
public final class l0 extends a2 {
    public final long f50034a;
    public final String f50035b;
    public final u1 f50036c;
    public final v1 d;
    public final w1 e;
    public final z1 f50037f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f50034a = j10;
        this.f50035b = str;
        this.f50036c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f50037f = z1Var;
    }

    public final com.google.firebase.messaging.m a() {
        ?? obj = new Object();
        obj.f6194a = Long.valueOf(this.f50034a);
        obj.f6195b = this.f50035b;
        obj.f6196c = this.f50036c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f6197f = this.f50037f;
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
            z1 z1Var2 = l0Var.f50037f;
            w1 w1Var2 = l0Var.e;
            if (this.f50034a == l0Var.f50034a && this.f50035b.equals(l0Var.f50035b) && this.f50036c.equals(l0Var.f50036c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f50037f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f50034a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f50035b.hashCode()) * 1000003) ^ this.f50036c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f50037f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f50034a + ", type=" + this.f50035b + ", app=" + this.f50036c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f50037f + "}";
    }
}
