package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51784a;
    public final String f51785b;
    public final int f51786c;
    public final int d;
    public final long e;
    public final long f51787f;
    public final long f51788g;
    public final String h;
    public final List f51789i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f51784a = i10;
        this.f51785b = str;
        this.f51786c = i11;
        this.d = i12;
        this.e = j10;
        this.f51787f = j11;
        this.f51788g = j12;
        this.h = str2;
        this.f51789i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51789i;
            String str2 = b0Var.h;
            if (this.f51784a == b0Var.f51784a && this.f51785b.equals(b0Var.f51785b) && this.f51786c == b0Var.f51786c && this.d == b0Var.d && this.e == b0Var.e && this.f51787f == b0Var.f51787f && this.f51788g == b0Var.f51788g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51789i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f51787f;
        long j12 = this.f51788g;
        int hashCode2 = (((((((((((((this.f51784a ^ 1000003) * 1000003) ^ this.f51785b.hashCode()) * 1000003) ^ this.f51786c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51789i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51784a + ", processName=" + this.f51785b + ", reasonCode=" + this.f51786c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f51787f + ", timestamp=" + this.f51788g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51789i + "}";
    }
}
