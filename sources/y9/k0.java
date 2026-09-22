package y9;
public final class k0 extends m1 {
    public final int f46887a;
    public final String f46888b;
    public final int f46889c;
    public final long d;
    public final long e;
    public final boolean f46890f;
    public final int f46891g;
    public final String h;
    public final String f46892i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f46887a = i10;
        this.f46888b = str;
        this.f46889c = i11;
        this.d = j3;
        this.e = j10;
        this.f46890f = z10;
        this.f46891g = i12;
        this.h = str2;
        this.f46892i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f46887a == k0Var.f46887a && this.f46888b.equals(k0Var.f46888b) && this.f46889c == k0Var.f46889c && this.d == k0Var.d && this.e == k0Var.e && this.f46890f == k0Var.f46890f && this.f46891g == k0Var.f46891g && this.h.equals(k0Var.h) && this.f46892i.equals(k0Var.f46892i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.e;
        int hashCode = (((((((((this.f46887a ^ 1000003) * 1000003) ^ this.f46888b.hashCode()) * 1000003) ^ this.f46889c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f46890f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f46891g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46892i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f46887a);
        sb2.append(", model=");
        sb2.append(this.f46888b);
        sb2.append(", cores=");
        sb2.append(this.f46889c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f46890f);
        sb2.append(", state=");
        sb2.append(this.f46891g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, this.f46892i, "}");
    }
}
