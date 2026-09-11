package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f49701a;
    public final String f49702b;
    public final int f49703c;
    public final int d;
    public final long f49704e;
    public final long f49705f;
    public final long f49706g;
    public final String h;
    public final List f49707i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f49701a = i10;
        this.f49702b = str;
        this.f49703c = i11;
        this.d = i12;
        this.f49704e = j3;
        this.f49705f = j10;
        this.f49706g = j11;
        this.h = str2;
        this.f49707i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f49707i;
            String str2 = b0Var.h;
            if (this.f49701a == b0Var.f49701a && this.f49702b.equals(b0Var.f49702b) && this.f49703c == b0Var.f49703c && this.d == b0Var.d && this.f49704e == b0Var.f49704e && this.f49705f == b0Var.f49705f && this.f49706g == b0Var.f49706g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f49707i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49704e;
        long j10 = this.f49705f;
        long j11 = this.f49706g;
        int hashCode2 = (((((((((((((this.f49701a ^ 1000003) * 1000003) ^ this.f49702b.hashCode()) * 1000003) ^ this.f49703c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f49707i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f49701a + ", processName=" + this.f49702b + ", reasonCode=" + this.f49703c + ", importance=" + this.d + ", pss=" + this.f49704e + ", rss=" + this.f49705f + ", timestamp=" + this.f49706g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f49707i + "}";
    }
}
