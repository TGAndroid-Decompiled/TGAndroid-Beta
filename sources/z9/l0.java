package z9;
public final class l0 extends a2 {
    public final long f55336a;
    public final String f55337b;
    public final u1 f55338c;
    public final v1 d;
    public final w1 e;
    public final z1 f55339f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f55336a = j10;
        this.f55337b = str;
        this.f55338c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f55339f = z1Var;
    }

    public final j2.f a() {
        ?? obj = new Object();
        obj.f9347a = Long.valueOf(this.f55336a);
        obj.f9348b = this.f55337b;
        obj.f9349c = this.f55338c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f9350f = this.f55339f;
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
            z1 z1Var2 = l0Var.f55339f;
            w1 w1Var2 = l0Var.e;
            if (this.f55336a == l0Var.f55336a && this.f55337b.equals(l0Var.f55337b) && this.f55338c.equals(l0Var.f55338c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f55339f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f55336a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f55337b.hashCode()) * 1000003) ^ this.f55338c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f55339f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f55336a + ", type=" + this.f55337b + ", app=" + this.f55338c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f55339f + "}";
    }
}
