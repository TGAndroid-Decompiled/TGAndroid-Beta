package z9;

import android.os.Build;
public final class d1 {
    public final int f51344a;
    public final int f51345b;
    public final long f51346c;
    public final long d;
    public final boolean e;
    public final int f51347f;

    public d1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f51344a = i10;
        if (str != null) {
            this.f51345b = i11;
            this.f51346c = j10;
            this.d = j11;
            this.e = z10;
            this.f51347f = i12;
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
                if (this.f51344a == d1Var.f51344a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f51345b == d1Var.f51345b && this.f51346c == d1Var.f51346c && this.d == d1Var.d && this.e == d1Var.e && this.f51347f == d1Var.f51347f) {
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
        long j10 = this.f51346c;
        long j11 = this.d;
        int hashCode = (((((((((this.f51344a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f51345b) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f51347f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f51344a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f51345b);
        sb2.append(", totalRam=");
        sb2.append(this.f51346c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.e);
        sb2.append(", state=");
        sb2.append(this.f51347f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, Build.PRODUCT, "}");
    }
}
