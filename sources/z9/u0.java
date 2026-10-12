package z9;
public final class u0 extends v1 {
    public final Double f50096a;
    public final int f50097b;
    public final boolean f50098c;
    public final int d;
    public final long e;
    public final long f50099f;

    public u0(Double d, int i10, boolean z10, int i11, long j10, long j11) {
        this.f50096a = d;
        this.f50097b = i10;
        this.f50098c = z10;
        this.d = i11;
        this.e = j10;
        this.f50099f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f50096a;
            if (d != null ? d.equals(((u0) v1Var).f50096a) : ((u0) v1Var).f50096a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f50097b == u0Var.f50097b && this.f50098c == u0Var.f50098c && this.d == u0Var.d && this.e == u0Var.e && this.f50099f == u0Var.f50099f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f50096a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f50097b) * 1000003;
        if (this.f50098c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j10 = this.e;
        long j11 = this.f50099f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f50096a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f50097b);
        sb2.append(", proximityOn=");
        sb2.append(this.f50098c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return a1.g.r(sb2, this.f50099f, "}");
    }
}
