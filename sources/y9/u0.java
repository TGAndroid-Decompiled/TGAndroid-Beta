package y9;
public final class u0 extends v1 {
    public final Double f50790a;
    public final int f50791b;
    public final boolean f50792c;
    public final int d;
    public final long f50793e;
    public final long f50794f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f50790a = d;
        this.f50791b = i10;
        this.f50792c = z10;
        this.d = i11;
        this.f50793e = j3;
        this.f50794f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f50790a;
            if (d != null ? d.equals(((u0) v1Var).f50790a) : ((u0) v1Var).f50790a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f50791b == u0Var.f50791b && this.f50792c == u0Var.f50792c && this.d == u0Var.d && this.f50793e == u0Var.f50793e && this.f50794f == u0Var.f50794f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f50790a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f50791b) * 1000003;
        if (this.f50792c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.f50793e;
        long j10 = this.f50794f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f50790a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f50791b);
        sb2.append(", proximityOn=");
        sb2.append(this.f50792c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f50793e);
        sb2.append(", diskUsed=");
        return a4.a.s(sb2, this.f50794f, "}");
    }
}
