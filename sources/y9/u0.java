package y9;
public final class u0 extends v1 {
    public final Double f52071a;
    public final int f52072b;
    public final boolean f52073c;
    public final int d;
    public final long f52074e;
    public final long f52075f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f52071a = d;
        this.f52072b = i10;
        this.f52073c = z10;
        this.d = i11;
        this.f52074e = j3;
        this.f52075f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f52071a;
            if (d != null ? d.equals(((u0) v1Var).f52071a) : ((u0) v1Var).f52071a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f52072b == u0Var.f52072b && this.f52073c == u0Var.f52073c && this.d == u0Var.d && this.f52074e == u0Var.f52074e && this.f52075f == u0Var.f52075f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f52071a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f52072b) * 1000003;
        if (this.f52073c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.f52074e;
        long j10 = this.f52075f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f52071a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f52072b);
        sb2.append(", proximityOn=");
        sb2.append(this.f52073c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f52074e);
        sb2.append(", diskUsed=");
        return a1.g.s(sb2, this.f52075f, "}");
    }
}
