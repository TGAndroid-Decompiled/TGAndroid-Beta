package y9;
public final class u0 extends v1 {
    public final Double f49922a;
    public final int f49923b;
    public final boolean f49924c;
    public final int d;
    public final long f49925e;
    public final long f49926f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f49922a = d;
        this.f49923b = i10;
        this.f49924c = z10;
        this.d = i11;
        this.f49925e = j3;
        this.f49926f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f49922a;
            if (d != null ? d.equals(((u0) v1Var).f49922a) : ((u0) v1Var).f49922a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f49923b == u0Var.f49923b && this.f49924c == u0Var.f49924c && this.d == u0Var.d && this.f49925e == u0Var.f49925e && this.f49926f == u0Var.f49926f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f49922a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f49923b) * 1000003;
        if (this.f49924c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.f49925e;
        long j10 = this.f49926f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f49922a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f49923b);
        sb2.append(", proximityOn=");
        sb2.append(this.f49924c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f49925e);
        sb2.append(", diskUsed=");
        return a4.a.r(sb2, this.f49926f, "}");
    }
}
