package y9;
public final class k0 extends m1 {
    public final int f50698a;
    public final String f50699b;
    public final int f50700c;
    public final long d;
    public final long f50701e;
    public final boolean f50702f;
    public final int f50703g;
    public final String h;
    public final String f50704i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f50698a = i10;
        this.f50699b = str;
        this.f50700c = i11;
        this.d = j3;
        this.f50701e = j10;
        this.f50702f = z10;
        this.f50703g = i12;
        this.h = str2;
        this.f50704i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f50698a == k0Var.f50698a && this.f50699b.equals(k0Var.f50699b) && this.f50700c == k0Var.f50700c && this.d == k0Var.d && this.f50701e == k0Var.f50701e && this.f50702f == k0Var.f50702f && this.f50703g == k0Var.f50703g && this.h.equals(k0Var.h) && this.f50704i.equals(k0Var.f50704i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f50701e;
        int hashCode = (((((((((this.f50698a ^ 1000003) * 1000003) ^ this.f50699b.hashCode()) * 1000003) ^ this.f50700c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f50702f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f50703g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50704i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f50698a);
        sb2.append(", model=");
        sb2.append(this.f50699b);
        sb2.append(", cores=");
        sb2.append(this.f50700c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f50701e);
        sb2.append(", simulator=");
        sb2.append(this.f50702f);
        sb2.append(", state=");
        sb2.append(this.f50703g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.t(sb2, this.f50704i, "}");
    }
}
