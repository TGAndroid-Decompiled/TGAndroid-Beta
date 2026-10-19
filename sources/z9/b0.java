package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51314a;
    public final String f51315b;
    public final int f51316c;
    public final int d;
    public final long e;
    public final long f51317f;
    public final long f51318g;
    public final String h;
    public final List f51319i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f51314a = i10;
        this.f51315b = str;
        this.f51316c = i11;
        this.d = i12;
        this.e = j10;
        this.f51317f = j11;
        this.f51318g = j12;
        this.h = str2;
        this.f51319i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51319i;
            String str2 = b0Var.h;
            if (this.f51314a == b0Var.f51314a && this.f51315b.equals(b0Var.f51315b) && this.f51316c == b0Var.f51316c && this.d == b0Var.d && this.e == b0Var.e && this.f51317f == b0Var.f51317f && this.f51318g == b0Var.f51318g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51319i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f51317f;
        long j12 = this.f51318g;
        int hashCode2 = (((((((((((((this.f51314a ^ 1000003) * 1000003) ^ this.f51315b.hashCode()) * 1000003) ^ this.f51316c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51319i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51314a + ", processName=" + this.f51315b + ", reasonCode=" + this.f51316c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f51317f + ", timestamp=" + this.f51318g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51319i + "}";
    }
}
