package z9;
public final class u0 extends v1 {
    public final Double f51490a;
    public final int f51491b;
    public final boolean f51492c;
    public final int d;
    public final long e;
    public final long f51493f;

    public u0(Double d, int i10, boolean z10, int i11, long j10, long j11) {
        this.f51490a = d;
        this.f51491b = i10;
        this.f51492c = z10;
        this.d = i11;
        this.e = j10;
        this.f51493f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f51490a;
            if (d != null ? d.equals(((u0) v1Var).f51490a) : ((u0) v1Var).f51490a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f51491b == u0Var.f51491b && this.f51492c == u0Var.f51492c && this.d == u0Var.d && this.e == u0Var.e && this.f51493f == u0Var.f51493f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f51490a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f51491b) * 1000003;
        if (this.f51492c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j10 = this.e;
        long j11 = this.f51493f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f51490a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f51491b);
        sb2.append(", proximityOn=");
        sb2.append(this.f51492c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return a1.g.r(sb2, this.f51493f, "}");
    }
}
