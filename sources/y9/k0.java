package y9;
public final class k0 extends m1 {
    public final int f50690a;
    public final String f50691b;
    public final int f50692c;
    public final long d;
    public final long f50693e;
    public final boolean f50694f;
    public final int f50695g;
    public final String h;
    public final String f50696i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f50690a = i10;
        this.f50691b = str;
        this.f50692c = i11;
        this.d = j3;
        this.f50693e = j10;
        this.f50694f = z10;
        this.f50695g = i12;
        this.h = str2;
        this.f50696i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f50690a == k0Var.f50690a && this.f50691b.equals(k0Var.f50691b) && this.f50692c == k0Var.f50692c && this.d == k0Var.d && this.f50693e == k0Var.f50693e && this.f50694f == k0Var.f50694f && this.f50695g == k0Var.f50695g && this.h.equals(k0Var.h) && this.f50696i.equals(k0Var.f50696i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f50693e;
        int hashCode = (((((((((this.f50690a ^ 1000003) * 1000003) ^ this.f50691b.hashCode()) * 1000003) ^ this.f50692c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f50694f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f50695g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50696i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f50690a);
        sb2.append(", model=");
        sb2.append(this.f50691b);
        sb2.append(", cores=");
        sb2.append(this.f50692c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f50693e);
        sb2.append(", simulator=");
        sb2.append(this.f50694f);
        sb2.append(", state=");
        sb2.append(this.f50695g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, this.f50696i, "}");
    }
}
