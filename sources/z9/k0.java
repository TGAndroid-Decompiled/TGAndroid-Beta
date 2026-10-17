package z9;
public final class k0 extends m1 {
    public final int f51430a;
    public final String f51431b;
    public final int f51432c;
    public final long d;
    public final long e;
    public final boolean f51433f;
    public final int f51434g;
    public final String h;
    public final String f51435i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f51430a = i10;
        this.f51431b = str;
        this.f51432c = i11;
        this.d = j10;
        this.e = j11;
        this.f51433f = z10;
        this.f51434g = i12;
        this.h = str2;
        this.f51435i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f51430a == k0Var.f51430a && this.f51431b.equals(k0Var.f51431b) && this.f51432c == k0Var.f51432c && this.d == k0Var.d && this.e == k0Var.e && this.f51433f == k0Var.f51433f && this.f51434g == k0Var.f51434g && this.h.equals(k0Var.h) && this.f51435i.equals(k0Var.f51435i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.e;
        int hashCode = (((((((((this.f51430a ^ 1000003) * 1000003) ^ this.f51431b.hashCode()) * 1000003) ^ this.f51432c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f51433f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f51434g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51435i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f51430a);
        sb2.append(", model=");
        sb2.append(this.f51431b);
        sb2.append(", cores=");
        sb2.append(this.f51432c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f51433f);
        sb2.append(", state=");
        sb2.append(this.f51434g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, this.f51435i, "}");
    }
}
