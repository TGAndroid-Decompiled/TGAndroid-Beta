package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f46491a;
    public final String f46492b;
    public final int f46493c;
    public final int d;
    public final long e;
    public final long f46494f;
    public final long f46495g;
    public final String h;
    public final List f46496i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f46491a = i10;
        this.f46492b = str;
        this.f46493c = i11;
        this.d = i12;
        this.e = j3;
        this.f46494f = j10;
        this.f46495g = j11;
        this.h = str2;
        this.f46496i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f46496i;
            String str2 = b0Var.h;
            if (this.f46491a == b0Var.f46491a && this.f46492b.equals(b0Var.f46492b) && this.f46493c == b0Var.f46493c && this.d == b0Var.d && this.e == b0Var.e && this.f46494f == b0Var.f46494f && this.f46495g == b0Var.f46495g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f46496i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.e;
        long j10 = this.f46494f;
        long j11 = this.f46495g;
        int hashCode2 = (((((((((((((this.f46491a ^ 1000003) * 1000003) ^ this.f46492b.hashCode()) * 1000003) ^ this.f46493c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f46496i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f46491a + ", processName=" + this.f46492b + ", reasonCode=" + this.f46493c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f46494f + ", timestamp=" + this.f46495g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f46496i + "}";
    }
}
