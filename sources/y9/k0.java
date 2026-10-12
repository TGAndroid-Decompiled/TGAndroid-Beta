package y9;
public final class k0 extends m1 {
    public final int f52210a;
    public final String f52211b;
    public final int f52212c;
    public final long d;
    public final long f52213e;
    public final boolean f52214f;
    public final int f52215g;
    public final String h;
    public final String f52216i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f52210a = i10;
        this.f52211b = str;
        this.f52212c = i11;
        this.d = j3;
        this.f52213e = j10;
        this.f52214f = z10;
        this.f52215g = i12;
        this.h = str2;
        this.f52216i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f52210a == k0Var.f52210a && this.f52211b.equals(k0Var.f52211b) && this.f52212c == k0Var.f52212c && this.d == k0Var.d && this.f52213e == k0Var.f52213e && this.f52214f == k0Var.f52214f && this.f52215g == k0Var.f52215g && this.h.equals(k0Var.h) && this.f52216i.equals(k0Var.f52216i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f52213e;
        int hashCode = (((((((((this.f52210a ^ 1000003) * 1000003) ^ this.f52211b.hashCode()) * 1000003) ^ this.f52212c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f52214f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f52215g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f52216i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f52210a);
        sb2.append(", model=");
        sb2.append(this.f52211b);
        sb2.append(", cores=");
        sb2.append(this.f52212c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f52213e);
        sb2.append(", simulator=");
        sb2.append(this.f52214f);
        sb2.append(", state=");
        sb2.append(this.f52215g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.t(sb2, this.f52216i, "}");
    }
}
