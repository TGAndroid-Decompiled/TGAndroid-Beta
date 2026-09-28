package y9;
public final class k0 extends m1 {
    public final int f46843a;
    public final String f46844b;
    public final int f46845c;
    public final long d;
    public final long e;
    public final boolean f46846f;
    public final int f46847g;
    public final String h;
    public final String f46848i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f46843a = i10;
        this.f46844b = str;
        this.f46845c = i11;
        this.d = j3;
        this.e = j10;
        this.f46846f = z10;
        this.f46847g = i12;
        this.h = str2;
        this.f46848i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f46843a == k0Var.f46843a && this.f46844b.equals(k0Var.f46844b) && this.f46845c == k0Var.f46845c && this.d == k0Var.d && this.e == k0Var.e && this.f46846f == k0Var.f46846f && this.f46847g == k0Var.f46847g && this.h.equals(k0Var.h) && this.f46848i.equals(k0Var.f46848i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.e;
        int hashCode = (((((((((this.f46843a ^ 1000003) * 1000003) ^ this.f46844b.hashCode()) * 1000003) ^ this.f46845c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f46846f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f46847g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46848i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f46843a);
        sb2.append(", model=");
        sb2.append(this.f46844b);
        sb2.append(", cores=");
        sb2.append(this.f46845c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f46846f);
        sb2.append(", state=");
        sb2.append(this.f46847g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.t(sb2, this.f46848i, "}");
    }
}
