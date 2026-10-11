package y9;
public final class k0 extends m1 {
    public final int f52073a;
    public final String f52074b;
    public final int f52075c;
    public final long d;
    public final long f52076e;
    public final boolean f52077f;
    public final int f52078g;
    public final String h;
    public final String f52079i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f52073a = i10;
        this.f52074b = str;
        this.f52075c = i11;
        this.d = j3;
        this.f52076e = j10;
        this.f52077f = z10;
        this.f52078g = i12;
        this.h = str2;
        this.f52079i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f52073a == k0Var.f52073a && this.f52074b.equals(k0Var.f52074b) && this.f52075c == k0Var.f52075c && this.d == k0Var.d && this.f52076e == k0Var.f52076e && this.f52077f == k0Var.f52077f && this.f52078g == k0Var.f52078g && this.h.equals(k0Var.h) && this.f52079i.equals(k0Var.f52079i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f52076e;
        int hashCode = (((((((((this.f52073a ^ 1000003) * 1000003) ^ this.f52074b.hashCode()) * 1000003) ^ this.f52075c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f52077f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f52078g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f52079i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f52073a);
        sb2.append(", model=");
        sb2.append(this.f52074b);
        sb2.append(", cores=");
        sb2.append(this.f52075c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f52076e);
        sb2.append(", simulator=");
        sb2.append(this.f52077f);
        sb2.append(", state=");
        sb2.append(this.f52078g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.t(sb2, this.f52079i, "}");
    }
}
