package y9;
public final class k0 extends m1 {
    public final int f49809a;
    public final String f49810b;
    public final int f49811c;
    public final long d;
    public final long f49812e;
    public final boolean f49813f;
    public final int f49814g;
    public final String h;
    public final String f49815i;

    public k0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.f49809a = i10;
        this.f49810b = str;
        this.f49811c = i11;
        this.d = j3;
        this.f49812e = j10;
        this.f49813f = z10;
        this.f49814g = i12;
        this.h = str2;
        this.f49815i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f49809a == k0Var.f49809a && this.f49810b.equals(k0Var.f49810b) && this.f49811c == k0Var.f49811c && this.d == k0Var.d && this.f49812e == k0Var.f49812e && this.f49813f == k0Var.f49813f && this.f49814g == k0Var.f49814g && this.h.equals(k0Var.h) && this.f49815i.equals(k0Var.f49815i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.d;
        long j10 = this.f49812e;
        int hashCode = (((((((((this.f49809a ^ 1000003) * 1000003) ^ this.f49810b.hashCode()) * 1000003) ^ this.f49811c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f49813f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f49814g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f49815i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f49809a);
        sb2.append(", model=");
        sb2.append(this.f49810b);
        sb2.append(", cores=");
        sb2.append(this.f49811c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f49812e);
        sb2.append(", simulator=");
        sb2.append(this.f49813f);
        sb2.append(", state=");
        sb2.append(this.f49814g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, this.f49815i, "}");
    }
}
