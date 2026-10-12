package z9;
public final class k0 extends m1 {
    public final int f50024a;
    public final String f50025b;
    public final int f50026c;
    public final long d;
    public final long e;
    public final boolean f50027f;
    public final int f50028g;
    public final String h;
    public final String f50029i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f50024a = i10;
        this.f50025b = str;
        this.f50026c = i11;
        this.d = j10;
        this.e = j11;
        this.f50027f = z10;
        this.f50028g = i12;
        this.h = str2;
        this.f50029i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f50024a == k0Var.f50024a && this.f50025b.equals(k0Var.f50025b) && this.f50026c == k0Var.f50026c && this.d == k0Var.d && this.e == k0Var.e && this.f50027f == k0Var.f50027f && this.f50028g == k0Var.f50028g && this.h.equals(k0Var.h) && this.f50029i.equals(k0Var.f50029i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.e;
        int hashCode = (((((((((this.f50024a ^ 1000003) * 1000003) ^ this.f50025b.hashCode()) * 1000003) ^ this.f50026c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f50027f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f50028g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50029i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f50024a);
        sb2.append(", model=");
        sb2.append(this.f50025b);
        sb2.append(", cores=");
        sb2.append(this.f50026c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f50027f);
        sb2.append(", state=");
        sb2.append(this.f50028g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, this.f50029i, "}");
    }
}
