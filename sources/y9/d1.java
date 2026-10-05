package y9;

import android.os.Build;
public final class d1 {
    public final int f50631a;
    public final int f50632b;
    public final long f50633c;
    public final long d;
    public final boolean f50634e;
    public final int f50635f;

    public d1(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f50631a = i10;
        if (str != null) {
            this.f50632b = i11;
            this.f50633c = j3;
            this.d = j10;
            this.f50634e = z10;
            this.f50635f = i12;
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
                if (this.f50631a == d1Var.f50631a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f50632b == d1Var.f50632b && this.f50633c == d1Var.f50633c && this.d == d1Var.d && this.f50634e == d1Var.f50634e && this.f50635f == d1Var.f50635f) {
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
        long j3 = this.f50633c;
        long j10 = this.d;
        int hashCode = (((((((((this.f50631a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f50632b) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f50634e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f50635f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f50631a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f50632b);
        sb2.append(", totalRam=");
        sb2.append(this.f50633c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.f50634e);
        sb2.append(", state=");
        sb2.append(this.f50635f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a4.a.t(sb2, Build.PRODUCT, "}");
    }
}
