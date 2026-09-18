package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f46723a;
    public final String f46724b;
    public final int f46725c;
    public final int d;
    public final long e;
    public final long f46726f;
    public final long f46727g;
    public final String h;
    public final List f46728i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f46723a = i10;
        this.f46724b = str;
        this.f46725c = i11;
        this.d = i12;
        this.e = j3;
        this.f46726f = j10;
        this.f46727g = j11;
        this.h = str2;
        this.f46728i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f46728i;
            String str2 = b0Var.h;
            if (this.f46723a == b0Var.f46723a && this.f46724b.equals(b0Var.f46724b) && this.f46725c == b0Var.f46725c && this.d == b0Var.d && this.e == b0Var.e && this.f46726f == b0Var.f46726f && this.f46727g == b0Var.f46727g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f46728i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.e;
        long j10 = this.f46726f;
        long j11 = this.f46727g;
        int hashCode2 = (((((((((((((this.f46723a ^ 1000003) * 1000003) ^ this.f46724b.hashCode()) * 1000003) ^ this.f46725c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f46728i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f46723a + ", processName=" + this.f46724b + ", reasonCode=" + this.f46725c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f46726f + ", timestamp=" + this.f46727g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f46728i + "}";
    }
}
