package y9;
public final class k0 extends m1 {
    public final int f50705a;
    public final String f50706b;
    public final int f50707c;
    public final long d;
    public final long f50708e;
    public final boolean f50709f;
    public final int f50710g;
    public final String h;
    public final String f50711i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f50705a = i10;
        this.f50706b = str;
        this.f50707c = i11;
        this.d = j3;
        this.f50708e = j10;
        this.f50709f = z10;
        this.f50710g = i12;
        this.h = str2;
        this.f50711i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f50705a == k0Var.f50705a && this.f50706b.equals(k0Var.f50706b) && this.f50707c == k0Var.f50707c && this.d == k0Var.d && this.f50708e == k0Var.f50708e && this.f50709f == k0Var.f50709f && this.f50710g == k0Var.f50710g && this.h.equals(k0Var.h) && this.f50711i.equals(k0Var.f50711i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f50708e;
        int hashCode = (((((((((this.f50705a ^ 1000003) * 1000003) ^ this.f50706b.hashCode()) * 1000003) ^ this.f50707c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f50709f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f50710g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50711i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f50705a);
        sb2.append(", model=");
        sb2.append(this.f50706b);
        sb2.append(", cores=");
        sb2.append(this.f50707c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f50708e);
        sb2.append(", simulator=");
        sb2.append(this.f50709f);
        sb2.append(", state=");
        sb2.append(this.f50710g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.t(sb2, this.f50711i, "}");
    }
}
