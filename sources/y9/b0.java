package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f50582a;
    public final String f50583b;
    public final int f50584c;
    public final int d;
    public final long f50585e;
    public final long f50586f;
    public final long f50587g;
    public final String h;
    public final List f50588i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f50582a = i10;
        this.f50583b = str;
        this.f50584c = i11;
        this.d = i12;
        this.f50585e = j3;
        this.f50586f = j10;
        this.f50587g = j11;
        this.h = str2;
        this.f50588i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f50588i;
            String str2 = b0Var.h;
            if (this.f50582a == b0Var.f50582a && this.f50583b.equals(b0Var.f50583b) && this.f50584c == b0Var.f50584c && this.d == b0Var.d && this.f50585e == b0Var.f50585e && this.f50586f == b0Var.f50586f && this.f50587g == b0Var.f50587g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f50588i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f50585e;
        long j10 = this.f50586f;
        long j11 = this.f50587g;
        int hashCode2 = (((((((((((((this.f50582a ^ 1000003) * 1000003) ^ this.f50583b.hashCode()) * 1000003) ^ this.f50584c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f50588i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f50582a + ", processName=" + this.f50583b + ", reasonCode=" + this.f50584c + ", importance=" + this.d + ", pss=" + this.f50585e + ", rss=" + this.f50586f + ", timestamp=" + this.f50587g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f50588i + "}";
    }
}
