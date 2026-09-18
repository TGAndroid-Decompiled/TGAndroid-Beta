package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f46496a;
    public final String f46497b;
    public final int f46498c;
    public final int d;
    public final long e;
    public final long f46499f;
    public final long f46500g;
    public final String h;
    public final List f46501i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f46496a = i10;
        this.f46497b = str;
        this.f46498c = i11;
        this.d = i12;
        this.e = j3;
        this.f46499f = j10;
        this.f46500g = j11;
        this.h = str2;
        this.f46501i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f46501i;
            String str2 = b0Var.h;
            if (this.f46496a == b0Var.f46496a && this.f46497b.equals(b0Var.f46497b) && this.f46498c == b0Var.f46498c && this.d == b0Var.d && this.e == b0Var.e && this.f46499f == b0Var.f46499f && this.f46500g == b0Var.f46500g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f46501i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.e;
        long j10 = this.f46499f;
        long j11 = this.f46500g;
        int hashCode2 = (((((((((((((this.f46496a ^ 1000003) * 1000003) ^ this.f46497b.hashCode()) * 1000003) ^ this.f46498c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f46501i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f46496a + ", processName=" + this.f46497b + ", reasonCode=" + this.f46498c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f46499f + ", timestamp=" + this.f46500g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f46501i + "}";
    }
}
