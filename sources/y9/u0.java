package y9;
public final class u0 extends v1 {
    public final Double f52115a;
    public final int f52116b;
    public final boolean f52117c;
    public final int d;
    public final long f52118e;
    public final long f52119f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f52115a = d;
        this.f52116b = i10;
        this.f52117c = z10;
        this.d = i11;
        this.f52118e = j3;
        this.f52119f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f52115a;
            if (d != null ? d.equals(((u0) v1Var).f52115a) : ((u0) v1Var).f52115a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f52116b == u0Var.f52116b && this.f52117c == u0Var.f52117c && this.d == u0Var.d && this.f52118e == u0Var.f52118e && this.f52119f == u0Var.f52119f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f52115a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f52116b) * 1000003;
        if (this.f52117c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.f52118e;
        long j10 = this.f52119f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f52115a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f52116b);
        sb2.append(", proximityOn=");
        sb2.append(this.f52117c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f52118e);
        sb2.append(", diskUsed=");
        return a1.g.s(sb2, this.f52119f, "}");
    }
}
