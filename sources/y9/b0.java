package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f52000a;
    public final String f52001b;
    public final int f52002c;
    public final int d;
    public final long f52003e;
    public final long f52004f;
    public final long f52005g;
    public final String h;
    public final List f52006i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f52000a = i10;
        this.f52001b = str;
        this.f52002c = i11;
        this.d = i12;
        this.f52003e = j3;
        this.f52004f = j10;
        this.f52005g = j11;
        this.h = str2;
        this.f52006i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f52006i;
            String str2 = b0Var.h;
            if (this.f52000a == b0Var.f52000a && this.f52001b.equals(b0Var.f52001b) && this.f52002c == b0Var.f52002c && this.d == b0Var.d && this.f52003e == b0Var.f52003e && this.f52004f == b0Var.f52004f && this.f52005g == b0Var.f52005g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f52006i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52003e;
        long j10 = this.f52004f;
        long j11 = this.f52005g;
        int hashCode2 = (((((((((((((this.f52000a ^ 1000003) * 1000003) ^ this.f52001b.hashCode()) * 1000003) ^ this.f52002c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f52006i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f52000a + ", processName=" + this.f52001b + ", reasonCode=" + this.f52002c + ", importance=" + this.d + ", pss=" + this.f52003e + ", rss=" + this.f52004f + ", timestamp=" + this.f52005g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f52006i + "}";
    }
}
