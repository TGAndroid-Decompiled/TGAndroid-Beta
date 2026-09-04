package y9;

import android.os.Build;
public final class d1 {
    public final int f49734a;
    public final int f49735b;
    public final long f49736c;
    public final long d;
    public final boolean f49737e;
    public final int f49738f;

    public d1(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f49734a = i10;
        if (str != null) {
            this.f49735b = i11;
            this.f49736c = j3;
            this.d = j10;
            this.f49737e = z10;
            this.f49738f = i12;
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
                if (this.f49734a == d1Var.f49734a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f49735b == d1Var.f49735b && this.f49736c == d1Var.f49736c && this.d == d1Var.d && this.f49737e == d1Var.f49737e && this.f49738f == d1Var.f49738f) {
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
        long j3 = this.f49736c;
        long j10 = this.d;
        int hashCode = (((((((((this.f49734a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f49735b) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f49737e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f49738f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f49734a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f49735b);
        sb2.append(", totalRam=");
        sb2.append(this.f49736c);
        sb2.append(", diskSpace=");
        sb2.append(this.d);
        sb2.append(", isEmulator=");
        sb2.append(this.f49737e);
        sb2.append(", state=");
        sb2.append(this.f49738f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a4.a.s(sb2, Build.PRODUCT, "}");
    }
}
