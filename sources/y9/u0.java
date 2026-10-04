package y9;
public final class u0 extends v1 {
    public final Double f50774a;
    public final int f50775b;
    public final boolean f50776c;
    public final int d;
    public final long f50777e;
    public final long f50778f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f50774a = d;
        this.f50775b = i10;
        this.f50776c = z10;
        this.d = i11;
        this.f50777e = j3;
        this.f50778f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f50774a;
            if (d != null ? d.equals(((u0) v1Var).f50774a) : ((u0) v1Var).f50774a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f50775b == u0Var.f50775b && this.f50776c == u0Var.f50776c && this.d == u0Var.d && this.f50777e == u0Var.f50777e && this.f50778f == u0Var.f50778f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f50774a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f50775b) * 1000003;
        if (this.f50776c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.f50777e;
        long j10 = this.f50778f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f50774a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f50775b);
        sb2.append(", proximityOn=");
        sb2.append(this.f50776c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f50777e);
        sb2.append(", diskUsed=");
        return a4.a.r(sb2, this.f50778f, "}");
    }
}
