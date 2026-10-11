package y9;
public final class k0 extends m1 {
    public final int f52107a;
    public final String f52108b;
    public final int f52109c;
    public final long d;
    public final long f52110e;
    public final boolean f52111f;
    public final int f52112g;
    public final String h;
    public final String f52113i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f52107a = i10;
        this.f52108b = str;
        this.f52109c = i11;
        this.d = j3;
        this.f52110e = j10;
        this.f52111f = z10;
        this.f52112g = i12;
        this.h = str2;
        this.f52113i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f52107a == k0Var.f52107a && this.f52108b.equals(k0Var.f52108b) && this.f52109c == k0Var.f52109c && this.d == k0Var.d && this.f52110e == k0Var.f52110e && this.f52111f == k0Var.f52111f && this.f52112g == k0Var.f52112g && this.h.equals(k0Var.h) && this.f52113i.equals(k0Var.f52113i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f52110e;
        int hashCode = (((((((((this.f52107a ^ 1000003) * 1000003) ^ this.f52108b.hashCode()) * 1000003) ^ this.f52109c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f52111f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f52112g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f52113i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f52107a);
        sb2.append(", model=");
        sb2.append(this.f52108b);
        sb2.append(", cores=");
        sb2.append(this.f52109c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f52110e);
        sb2.append(", simulator=");
        sb2.append(this.f52111f);
        sb2.append(", state=");
        sb2.append(this.f52112g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.t(sb2, this.f52113i, "}");
    }
}
