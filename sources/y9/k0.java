package y9;
public final class k0 extends m1 {
    public final int f51984a;
    public final String f51985b;
    public final int f51986c;
    public final long d;
    public final long f51987e;
    public final boolean f51988f;
    public final int f51989g;
    public final String h;
    public final String f51990i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f51984a = i10;
        this.f51985b = str;
        this.f51986c = i11;
        this.d = j3;
        this.f51987e = j10;
        this.f51988f = z10;
        this.f51989g = i12;
        this.h = str2;
        this.f51990i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f51984a == k0Var.f51984a && this.f51985b.equals(k0Var.f51985b) && this.f51986c == k0Var.f51986c && this.d == k0Var.d && this.f51987e == k0Var.f51987e && this.f51988f == k0Var.f51988f && this.f51989g == k0Var.f51989g && this.h.equals(k0Var.h) && this.f51990i.equals(k0Var.f51990i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f51987e;
        int hashCode = (((((((((this.f51984a ^ 1000003) * 1000003) ^ this.f51985b.hashCode()) * 1000003) ^ this.f51986c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f51988f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f51989g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51990i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f51984a);
        sb2.append(", model=");
        sb2.append(this.f51985b);
        sb2.append(", cores=");
        sb2.append(this.f51986c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f51987e);
        sb2.append(", simulator=");
        sb2.append(this.f51988f);
        sb2.append(", state=");
        sb2.append(this.f51989g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.t(sb2, this.f51990i, "}");
    }
}
