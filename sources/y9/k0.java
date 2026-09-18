package y9;
public final class k0 extends m1 {
    public final int f46819a;
    public final String f46820b;
    public final int f46821c;
    public final long d;
    public final long e;
    public final boolean f46822f;
    public final int f46823g;
    public final String h;
    public final String f46824i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f46819a = i10;
        this.f46820b = str;
        this.f46821c = i11;
        this.d = j3;
        this.e = j10;
        this.f46822f = z10;
        this.f46823g = i12;
        this.h = str2;
        this.f46824i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f46819a == k0Var.f46819a && this.f46820b.equals(k0Var.f46820b) && this.f46821c == k0Var.f46821c && this.d == k0Var.d && this.e == k0Var.e && this.f46822f == k0Var.f46822f && this.f46823g == k0Var.f46823g && this.h.equals(k0Var.h) && this.f46824i.equals(k0Var.f46824i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.e;
        int hashCode = (((((((((this.f46819a ^ 1000003) * 1000003) ^ this.f46820b.hashCode()) * 1000003) ^ this.f46821c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f46822f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f46823g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46824i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f46819a);
        sb2.append(", model=");
        sb2.append(this.f46820b);
        sb2.append(", cores=");
        sb2.append(this.f46821c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f46822f);
        sb2.append(", state=");
        sb2.append(this.f46823g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, this.f46824i, "}");
    }
}
