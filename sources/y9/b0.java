package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f49731a;
    public final String f49732b;
    public final int f49733c;
    public final int d;
    public final long f49734e;
    public final long f49735f;
    public final long f49736g;
    public final String h;
    public final List f49737i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f49731a = i10;
        this.f49732b = str;
        this.f49733c = i11;
        this.d = i12;
        this.f49734e = j3;
        this.f49735f = j10;
        this.f49736g = j11;
        this.h = str2;
        this.f49737i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f49737i;
            String str2 = b0Var.h;
            if (this.f49731a == b0Var.f49731a && this.f49732b.equals(b0Var.f49732b) && this.f49733c == b0Var.f49733c && this.d == b0Var.d && this.f49734e == b0Var.f49734e && this.f49735f == b0Var.f49735f && this.f49736g == b0Var.f49736g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f49737i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49734e;
        long j10 = this.f49735f;
        long j11 = this.f49736g;
        int hashCode2 = (((((((((((((this.f49731a ^ 1000003) * 1000003) ^ this.f49732b.hashCode()) * 1000003) ^ this.f49733c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f49737i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f49731a + ", processName=" + this.f49732b + ", reasonCode=" + this.f49733c + ", importance=" + this.d + ", pss=" + this.f49734e + ", rss=" + this.f49735f + ", timestamp=" + this.f49736g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f49737i + "}";
    }
}
