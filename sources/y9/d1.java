package y9;

import android.os.Build;
public final class d1 {
    public final int f46777a;
    public final int f46778b;
    public final long f46779c;
    public final long d;
    public final boolean e;
    public final int f46780f;

    public d1(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f46777a = i10;
        if (str != null) {
            this.f46778b = i11;
            this.f46779c = j3;
            this.d = j10;
            this.e = z10;
            this.f46780f = i12;
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
                if (this.f46777a == d1Var.f46777a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f46778b == d1Var.f46778b && this.f46779c == d1Var.f46779c && this.d == d1Var.d && this.e == d1Var.e && this.f46780f == d1Var.f46780f) {
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
        long j3 = this.f46779c;
        long j10 = this.d;
        int hashCode = (((((((((this.f46777a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f46778b) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f46780f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f46777a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f46778b);
        sb2.append(", totalRam=");
        sb2.append(this.f46779c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.e);
        sb2.append(", state=");
        sb2.append(this.f46780f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a4.a.t(sb2, Build.PRODUCT, "}");
    }
}
