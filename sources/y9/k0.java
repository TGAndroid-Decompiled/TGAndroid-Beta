package y9;
public final class k0 extends m1 {
    public final int f49838a;
    public final String f49839b;
    public final int f49840c;
    public final long d;
    public final long f49841e;
    public final boolean f49842f;
    public final int f49843g;
    public final String h;
    public final String f49844i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f49838a = i10;
        this.f49839b = str;
        this.f49840c = i11;
        this.d = j3;
        this.f49841e = j10;
        this.f49842f = z10;
        this.f49843g = i12;
        this.h = str2;
        this.f49844i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f49838a == k0Var.f49838a && this.f49839b.equals(k0Var.f49839b) && this.f49840c == k0Var.f49840c && this.d == k0Var.d && this.f49841e == k0Var.f49841e && this.f49842f == k0Var.f49842f && this.f49843g == k0Var.f49843g && this.h.equals(k0Var.h) && this.f49844i.equals(k0Var.f49844i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f49841e;
        int hashCode = (((((((((this.f49838a ^ 1000003) * 1000003) ^ this.f49839b.hashCode()) * 1000003) ^ this.f49840c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f49842f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f49843g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f49844i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f49838a);
        sb2.append(", model=");
        sb2.append(this.f49839b);
        sb2.append(", cores=");
        sb2.append(this.f49840c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f49841e);
        sb2.append(", simulator=");
        sb2.append(this.f49842f);
        sb2.append(", state=");
        sb2.append(this.f49843g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, this.f49844i, "}");
    }
}
