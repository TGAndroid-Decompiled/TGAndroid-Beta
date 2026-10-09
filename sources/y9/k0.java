package y9;
public final class k0 extends m1 {
    public final int f51986a;
    public final String f51987b;
    public final int f51988c;
    public final long d;
    public final long f51989e;
    public final boolean f51990f;
    public final int f51991g;
    public final String h;
    public final String f51992i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f51986a = i10;
        this.f51987b = str;
        this.f51988c = i11;
        this.d = j3;
        this.f51989e = j10;
        this.f51990f = z10;
        this.f51991g = i12;
        this.h = str2;
        this.f51992i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f51986a == k0Var.f51986a && this.f51987b.equals(k0Var.f51987b) && this.f51988c == k0Var.f51988c && this.d == k0Var.d && this.f51989e == k0Var.f51989e && this.f51990f == k0Var.f51990f && this.f51991g == k0Var.f51991g && this.h.equals(k0Var.h) && this.f51992i.equals(k0Var.f51992i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f51989e;
        int hashCode = (((((((((this.f51986a ^ 1000003) * 1000003) ^ this.f51987b.hashCode()) * 1000003) ^ this.f51988c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f51990f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f51991g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51992i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f51986a);
        sb2.append(", model=");
        sb2.append(this.f51987b);
        sb2.append(", cores=");
        sb2.append(this.f51988c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f51989e);
        sb2.append(", simulator=");
        sb2.append(this.f51990f);
        sb2.append(", state=");
        sb2.append(this.f51991g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.t(sb2, this.f51992i, "}");
    }
}
