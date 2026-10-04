package y9;

import android.os.Build;
public final class d1 {
    public final int f50615a;
    public final int f50616b;
    public final long f50617c;
    public final long d;
    public final boolean f50618e;
    public final int f50619f;

    public d1(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f50615a = i10;
        if (str != null) {
            this.f50616b = i11;
            this.f50617c = j3;
            this.d = j10;
            this.f50618e = z10;
            this.f50619f = i12;
            if (str2 != null) {
                if (str3 != null) {
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d1) {
                d1 d1Var = (d1) obj;
                if (this.f50615a == d1Var.f50615a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f50616b == d1Var.f50616b && this.f50617c == d1Var.f50617c && this.d == d1Var.d && this.f50618e == d1Var.f50618e && this.f50619f == d1Var.f50619f) {
                        String str2 = Build.MANUFACTURER;
                        if (str2.equals(str2)) {
                            String str3 = Build.PRODUCT;
                            if (str3.equals(str3)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f50617c;
        long j10 = this.d;
        int hashCode = (((((((((this.f50615a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f50616b) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f50618e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f50619f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f50615a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f50616b);
        sb2.append(", totalRam=");
        sb2.append(this.f50617c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.f50618e);
        sb2.append(", state=");
        sb2.append(this.f50619f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, Build.PRODUCT, "}");
    }
}
