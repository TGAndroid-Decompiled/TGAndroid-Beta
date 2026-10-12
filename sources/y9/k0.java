package y9;
public final class k0 extends m1 {
    public final int f52218a;
    public final String f52219b;
    public final int f52220c;
    public final long d;
    public final long f52221e;
    public final boolean f52222f;
    public final int f52223g;
    public final String h;
    public final String f52224i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f52218a = i10;
        this.f52219b = str;
        this.f52220c = i11;
        this.d = j3;
        this.f52221e = j10;
        this.f52222f = z10;
        this.f52223g = i12;
        this.h = str2;
        this.f52224i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f52218a == k0Var.f52218a && this.f52219b.equals(k0Var.f52219b) && this.f52220c == k0Var.f52220c && this.d == k0Var.d && this.f52221e == k0Var.f52221e && this.f52222f == k0Var.f52222f && this.f52223g == k0Var.f52223g && this.h.equals(k0Var.h) && this.f52224i.equals(k0Var.f52224i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f52221e;
        int hashCode = (((((((((this.f52218a ^ 1000003) * 1000003) ^ this.f52219b.hashCode()) * 1000003) ^ this.f52220c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f52222f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f52223g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f52224i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f52218a);
        sb2.append(", model=");
        sb2.append(this.f52219b);
        sb2.append(", cores=");
        sb2.append(this.f52220c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f52221e);
        sb2.append(", simulator=");
        sb2.append(this.f52222f);
        sb2.append(", state=");
        sb2.append(this.f52223g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.t(sb2, this.f52224i, "}");
    }
}
