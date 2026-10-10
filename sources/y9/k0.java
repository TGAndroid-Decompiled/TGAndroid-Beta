package y9;
public final class k0 extends m1 {
    public final int f52030a;
    public final String f52031b;
    public final int f52032c;
    public final long d;
    public final long f52033e;
    public final boolean f52034f;
    public final int f52035g;
    public final String h;
    public final String f52036i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f52030a = i10;
        this.f52031b = str;
        this.f52032c = i11;
        this.d = j3;
        this.f52033e = j10;
        this.f52034f = z10;
        this.f52035g = i12;
        this.h = str2;
        this.f52036i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f52030a == k0Var.f52030a && this.f52031b.equals(k0Var.f52031b) && this.f52032c == k0Var.f52032c && this.d == k0Var.d && this.f52033e == k0Var.f52033e && this.f52034f == k0Var.f52034f && this.f52035g == k0Var.f52035g && this.h.equals(k0Var.h) && this.f52036i.equals(k0Var.f52036i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f52033e;
        int hashCode = (((((((((this.f52030a ^ 1000003) * 1000003) ^ this.f52031b.hashCode()) * 1000003) ^ this.f52032c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f52034f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f52035g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f52036i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f52030a);
        sb2.append(", model=");
        sb2.append(this.f52031b);
        sb2.append(", cores=");
        sb2.append(this.f52032c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f52033e);
        sb2.append(", simulator=");
        sb2.append(this.f52034f);
        sb2.append(", state=");
        sb2.append(this.f52035g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.t(sb2, this.f52036i, "}");
    }
}
