package y9;
public final class u0 extends v1 {
    public final Double f49893a;
    public final int f49894b;
    public final boolean f49895c;
    public final int d;
    public final long f49896e;
    public final long f49897f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f49893a = d;
        this.f49894b = i10;
        this.f49895c = z10;
        this.d = i11;
        this.f49896e = j3;
        this.f49897f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f49893a;
            if (d != null ? d.equals(((u0) v1Var).f49893a) : ((u0) v1Var).f49893a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f49894b == u0Var.f49894b && this.f49895c == u0Var.f49895c && this.d == u0Var.d && this.f49896e == u0Var.f49896e && this.f49897f == u0Var.f49897f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f49893a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f49894b) * 1000003;
        if (this.f49895c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.f49896e;
        long j10 = this.f49897f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f49893a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f49894b);
        sb2.append(", proximityOn=");
        sb2.append(this.f49895c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f49896e);
        sb2.append(", diskUsed=");
        return a4.a.r(sb2, this.f49897f, "}");
    }
}
