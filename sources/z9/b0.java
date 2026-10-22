package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51322a;
    public final String f51323b;
    public final int f51324c;
    public final int d;
    public final long e;
    public final long f51325f;
    public final long f51326g;
    public final String h;
    public final List f51327i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f51322a = i10;
        this.f51323b = str;
        this.f51324c = i11;
        this.d = i12;
        this.e = j10;
        this.f51325f = j11;
        this.f51326g = j12;
        this.h = str2;
        this.f51327i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51327i;
            String str2 = b0Var.h;
            if (this.f51322a == b0Var.f51322a && this.f51323b.equals(b0Var.f51323b) && this.f51324c == b0Var.f51324c && this.d == b0Var.d && this.e == b0Var.e && this.f51325f == b0Var.f51325f && this.f51326g == b0Var.f51326g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51327i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f51325f;
        long j12 = this.f51326g;
        int hashCode2 = (((((((((((((this.f51322a ^ 1000003) * 1000003) ^ this.f51323b.hashCode()) * 1000003) ^ this.f51324c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51327i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51322a + ", processName=" + this.f51323b + ", reasonCode=" + this.f51324c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f51325f + ", timestamp=" + this.f51326g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51327i + "}";
    }
}
