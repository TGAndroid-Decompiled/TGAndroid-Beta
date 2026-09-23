package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f46422a;
    public final String f46423b;
    public final int f46424c;
    public final int d;
    public final long e;
    public final long f46425f;
    public final long f46426g;
    public final String h;
    public final List f46427i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f46422a = i10;
        this.f46423b = str;
        this.f46424c = i11;
        this.d = i12;
        this.e = j3;
        this.f46425f = j10;
        this.f46426g = j11;
        this.h = str2;
        this.f46427i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f46427i;
            String str2 = b0Var.h;
            if (this.f46422a == b0Var.f46422a && this.f46423b.equals(b0Var.f46423b) && this.f46424c == b0Var.f46424c && this.d == b0Var.d && this.e == b0Var.e && this.f46425f == b0Var.f46425f && this.f46426g == b0Var.f46426g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f46427i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.e;
        long j10 = this.f46425f;
        long j11 = this.f46426g;
        int hashCode2 = (((((((((((((this.f46422a ^ 1000003) * 1000003) ^ this.f46423b.hashCode()) * 1000003) ^ this.f46424c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f46427i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f46422a + ", processName=" + this.f46423b + ", reasonCode=" + this.f46424c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f46425f + ", timestamp=" + this.f46426g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f46427i + "}";
    }
}
