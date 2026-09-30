package y9;
public final class k0 extends m1 {
    public final int f46845a;
    public final String f46846b;
    public final int f46847c;
    public final long d;
    public final long e;
    public final boolean f46848f;
    public final int f46849g;
    public final String h;
    public final String f46850i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f46845a = i10;
        this.f46846b = str;
        this.f46847c = i11;
        this.d = j3;
        this.e = j10;
        this.f46848f = z10;
        this.f46849g = i12;
        this.h = str2;
        this.f46850i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f46845a == k0Var.f46845a && this.f46846b.equals(k0Var.f46846b) && this.f46847c == k0Var.f46847c && this.d == k0Var.d && this.e == k0Var.e && this.f46848f == k0Var.f46848f && this.f46849g == k0Var.f46849g && this.h.equals(k0Var.h) && this.f46850i.equals(k0Var.f46850i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.e;
        int hashCode = (((((((((this.f46845a ^ 1000003) * 1000003) ^ this.f46846b.hashCode()) * 1000003) ^ this.f46847c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f46848f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f46849g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46850i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f46845a);
        sb2.append(", model=");
        sb2.append(this.f46846b);
        sb2.append(", cores=");
        sb2.append(this.f46847c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f46848f);
        sb2.append(", state=");
        sb2.append(this.f46849g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.t(sb2, this.f46850i, "}");
    }
}
