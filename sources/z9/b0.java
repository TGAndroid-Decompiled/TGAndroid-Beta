package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51323a;
    public final String f51324b;
    public final int f51325c;
    public final int d;
    public final long e;
    public final long f51326f;
    public final long f51327g;
    public final String h;
    public final List f51328i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f51323a = i10;
        this.f51324b = str;
        this.f51325c = i11;
        this.d = i12;
        this.e = j10;
        this.f51326f = j11;
        this.f51327g = j12;
        this.h = str2;
        this.f51328i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51328i;
            String str2 = b0Var.h;
            if (this.f51323a == b0Var.f51323a && this.f51324b.equals(b0Var.f51324b) && this.f51325c == b0Var.f51325c && this.d == b0Var.d && this.e == b0Var.e && this.f51326f == b0Var.f51326f && this.f51327g == b0Var.f51327g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51328i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f51326f;
        long j12 = this.f51327g;
        int hashCode2 = (((((((((((((this.f51323a ^ 1000003) * 1000003) ^ this.f51324b.hashCode()) * 1000003) ^ this.f51325c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51328i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51323a + ", processName=" + this.f51324b + ", reasonCode=" + this.f51325c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f51326f + ", timestamp=" + this.f51327g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51328i + "}";
    }
}
