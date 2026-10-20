package z9;
public final class k0 extends m1 {
    public final int f51415a;
    public final String f51416b;
    public final int f51417c;
    public final long d;
    public final long e;
    public final boolean f51418f;
    public final int f51419g;
    public final String h;
    public final String f51420i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f51415a = i10;
        this.f51416b = str;
        this.f51417c = i11;
        this.d = j10;
        this.e = j11;
        this.f51418f = z10;
        this.f51419g = i12;
        this.h = str2;
        this.f51420i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f51415a == k0Var.f51415a && this.f51416b.equals(k0Var.f51416b) && this.f51417c == k0Var.f51417c && this.d == k0Var.d && this.e == k0Var.e && this.f51418f == k0Var.f51418f && this.f51419g == k0Var.f51419g && this.h.equals(k0Var.h) && this.f51420i.equals(k0Var.f51420i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.e;
        int hashCode = (((((((((this.f51415a ^ 1000003) * 1000003) ^ this.f51416b.hashCode()) * 1000003) ^ this.f51417c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f51418f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f51419g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51420i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f51415a);
        sb2.append(", model=");
        sb2.append(this.f51416b);
        sb2.append(", cores=");
        sb2.append(this.f51417c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f51418f);
        sb2.append(", state=");
        sb2.append(this.f51419g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, this.f51420i, "}");
    }
}
