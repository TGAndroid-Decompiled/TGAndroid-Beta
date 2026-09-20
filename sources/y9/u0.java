package y9;
public final class u0 extends v1 {
    public final Double f46938a;
    public final int f46939b;
    public final boolean f46940c;
    public final int d;
    public final long e;
    public final long f46941f;

    public u0(Double d, int i10, boolean z10, int i11, long j3, long j10) {
        this.f46938a = d;
        this.f46939b = i10;
        this.f46940c = z10;
        this.d = i11;
        this.e = j3;
        this.f46941f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f46938a;
            if (d != null ? d.equals(((u0) v1Var).f46938a) : ((u0) v1Var).f46938a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f46939b == u0Var.f46939b && this.f46940c == u0Var.f46940c && this.d == u0Var.d && this.e == u0Var.e && this.f46941f == u0Var.f46941f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f46938a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f46939b) * 1000003;
        if (this.f46940c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j3 = this.e;
        long j10 = this.f46941f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f46938a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f46939b);
        sb2.append(", proximityOn=");
        sb2.append(this.f46940c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return a4.a.r(sb2, this.f46941f, "}");
    }
}
