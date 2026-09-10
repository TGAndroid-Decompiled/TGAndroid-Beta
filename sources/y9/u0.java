package y9;
public final class u0 extends v1 {
    public final Double f46786a;
    public final int f46787b;
    public final boolean f46788c;
    public final int d;
    public final long e;
    public final long f46789f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f46786a = d;
        this.f46787b = i10;
        this.f46788c = z10;
        this.d = i11;
        this.e = j3;
        this.f46789f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f46786a;
            if (d != null ? d.equals(((u0) v1Var).f46786a) : ((u0) v1Var).f46786a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f46787b == u0Var.f46787b && this.f46788c == u0Var.f46788c && this.d == u0Var.d && this.e == u0Var.e && this.f46789f == u0Var.f46789f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f46786a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f46787b) * 1000003;
        if (this.f46788c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.e;
        long j10 = this.f46789f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f46786a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f46787b);
        sb2.append(", proximityOn=");
        sb2.append(this.f46788c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return a4.a.r(sb2, this.f46789f, "}");
    }
}
