package y9;
public final class k0 extends m1 {
    public final int f46518a;
    public final String f46519b;
    public final int f46520c;
    public final long d;
    public final long e;
    public final boolean f46521f;
    public final int f46522g;
    public final String h;
    public final String f46523i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f46518a = i10;
        this.f46519b = str;
        this.f46520c = i11;
        this.d = j3;
        this.e = j10;
        this.f46521f = z10;
        this.f46522g = i12;
        this.h = str2;
        this.f46523i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f46518a == k0Var.f46518a && this.f46519b.equals(k0Var.f46519b) && this.f46520c == k0Var.f46520c && this.d == k0Var.d && this.e == k0Var.e && this.f46521f == k0Var.f46521f && this.f46522g == k0Var.f46522g && this.h.equals(k0Var.h) && this.f46523i.equals(k0Var.f46523i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.e;
        int hashCode = (((((((((this.f46518a ^ 1000003) * 1000003) ^ this.f46519b.hashCode()) * 1000003) ^ this.f46520c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f46521f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f46522g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46523i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f46518a);
        sb2.append(", model=");
        sb2.append(this.f46519b);
        sb2.append(", cores=");
        sb2.append(this.f46520c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f46521f);
        sb2.append(", state=");
        sb2.append(this.f46522g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.t(sb2, this.f46523i, "}");
    }
}
