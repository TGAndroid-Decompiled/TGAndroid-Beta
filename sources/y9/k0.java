package y9;
public final class k0 extends m1 {
    public final int f49837a;
    public final String f49838b;
    public final int f49839c;
    public final long d;
    public final long f49840e;
    public final boolean f49841f;
    public final int f49842g;
    public final String h;
    public final String f49843i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f49837a = i10;
        this.f49838b = str;
        this.f49839c = i11;
        this.d = j3;
        this.f49840e = j10;
        this.f49841f = z10;
        this.f49842g = i12;
        this.h = str2;
        this.f49843i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f49837a == k0Var.f49837a && this.f49838b.equals(k0Var.f49838b) && this.f49839c == k0Var.f49839c && this.d == k0Var.d && this.f49840e == k0Var.f49840e && this.f49841f == k0Var.f49841f && this.f49842g == k0Var.f49842g && this.h.equals(k0Var.h) && this.f49843i.equals(k0Var.f49843i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f49840e;
        int hashCode = (((((((((this.f49837a ^ 1000003) * 1000003) ^ this.f49838b.hashCode()) * 1000003) ^ this.f49839c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f49841f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f49842g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f49843i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f49837a);
        sb2.append(", model=");
        sb2.append(this.f49838b);
        sb2.append(", cores=");
        sb2.append(this.f49839c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f49840e);
        sb2.append(", simulator=");
        sb2.append(this.f49841f);
        sb2.append(", state=");
        sb2.append(this.f49842g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, this.f49843i, "}");
    }
}
