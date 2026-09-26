package y9;
public final class u0 extends v1 {
    public final Double f46914a;
    public final int f46915b;
    public final boolean f46916c;
    public final int d;
    public final long e;
    public final long f46917f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f46914a = d;
        this.f46915b = i10;
        this.f46916c = z10;
        this.d = i11;
        this.e = j3;
        this.f46917f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f46914a;
            if (d != null ? d.equals(((u0) v1Var).f46914a) : ((u0) v1Var).f46914a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f46915b == u0Var.f46915b && this.f46916c == u0Var.f46916c && this.d == u0Var.d && this.e == u0Var.e && this.f46917f == u0Var.f46917f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f46914a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f46915b) * 1000003;
        if (this.f46916c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.e;
        long j10 = this.f46917f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f46914a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f46915b);
        sb2.append(", proximityOn=");
        sb2.append(this.f46916c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return a4.a.s(sb2, this.f46917f, "}");
    }
}
