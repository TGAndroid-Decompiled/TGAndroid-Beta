package y9;
public final class k0 extends m1 {
    public final int f50689a;
    public final String f50690b;
    public final int f50691c;
    public final long d;
    public final long f50692e;
    public final boolean f50693f;
    public final int f50694g;
    public final String h;
    public final String f50695i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f50689a = i10;
        this.f50690b = str;
        this.f50691c = i11;
        this.d = j3;
        this.f50692e = j10;
        this.f50693f = z10;
        this.f50694g = i12;
        this.h = str2;
        this.f50695i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f50689a == k0Var.f50689a && this.f50690b.equals(k0Var.f50690b) && this.f50691c == k0Var.f50691c && this.d == k0Var.d && this.f50692e == k0Var.f50692e && this.f50693f == k0Var.f50693f && this.f50694g == k0Var.f50694g && this.h.equals(k0Var.h) && this.f50695i.equals(k0Var.f50695i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f50692e;
        int hashCode = (((((((((this.f50689a ^ 1000003) * 1000003) ^ this.f50690b.hashCode()) * 1000003) ^ this.f50691c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f50693f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f50694g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50695i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f50689a);
        sb2.append(", model=");
        sb2.append(this.f50690b);
        sb2.append(", cores=");
        sb2.append(this.f50691c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f50692e);
        sb2.append(", simulator=");
        sb2.append(this.f50693f);
        sb2.append(", state=");
        sb2.append(this.f50694g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, this.f50695i, "}");
    }
}
