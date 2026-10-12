package y9;
public final class u0 extends v1 {
    public final Double f52303a;
    public final int f52304b;
    public final boolean f52305c;
    public final int d;
    public final long f52306e;
    public final long f52307f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f52303a = d;
        this.f52304b = i10;
        this.f52305c = z10;
        this.d = i11;
        this.f52306e = j3;
        this.f52307f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f52303a;
            if (d != null ? d.equals(((u0) v1Var).f52303a) : ((u0) v1Var).f52303a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f52304b == u0Var.f52304b && this.f52305c == u0Var.f52305c && this.d == u0Var.d && this.f52306e == u0Var.f52306e && this.f52307f == u0Var.f52307f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f52303a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f52304b) * 1000003;
        if (this.f52305c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.f52306e;
        long j10 = this.f52307f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f52303a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f52304b);
        sb2.append(", proximityOn=");
        sb2.append(this.f52305c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f52306e);
        sb2.append(", diskUsed=");
        return a1.g.s(sb2, this.f52307f, "}");
    }
}
