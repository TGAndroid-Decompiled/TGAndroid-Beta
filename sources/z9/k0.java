package z9;
public final class k0 extends m1 {
    public final int f51419a;
    public final String f51420b;
    public final int f51421c;
    public final long d;
    public final long e;
    public final boolean f51422f;
    public final int f51423g;
    public final String h;
    public final String f51424i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f51419a = i10;
        this.f51420b = str;
        this.f51421c = i11;
        this.d = j10;
        this.e = j11;
        this.f51422f = z10;
        this.f51423g = i12;
        this.h = str2;
        this.f51424i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f51419a == k0Var.f51419a && this.f51420b.equals(k0Var.f51420b) && this.f51421c == k0Var.f51421c && this.d == k0Var.d && this.e == k0Var.e && this.f51422f == k0Var.f51422f && this.f51423g == k0Var.f51423g && this.h.equals(k0Var.h) && this.f51424i.equals(k0Var.f51424i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.e;
        int hashCode = (((((((((this.f51419a ^ 1000003) * 1000003) ^ this.f51420b.hashCode()) * 1000003) ^ this.f51421c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f51422f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f51423g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51424i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f51419a);
        sb2.append(", model=");
        sb2.append(this.f51420b);
        sb2.append(", cores=");
        sb2.append(this.f51421c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f51422f);
        sb2.append(", state=");
        sb2.append(this.f51423g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, this.f51424i, "}");
    }
}
