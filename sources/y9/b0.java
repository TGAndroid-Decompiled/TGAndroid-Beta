package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51923a;
    public final String f51924b;
    public final int f51925c;
    public final int d;
    public final long f51926e;
    public final long f51927f;
    public final long f51928g;
    public final String h;
    public final List f51929i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f51923a = i10;
        this.f51924b = str;
        this.f51925c = i11;
        this.d = i12;
        this.f51926e = j3;
        this.f51927f = j10;
        this.f51928g = j11;
        this.h = str2;
        this.f51929i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51929i;
            String str2 = b0Var.h;
            if (this.f51923a == b0Var.f51923a && this.f51924b.equals(b0Var.f51924b) && this.f51925c == b0Var.f51925c && this.d == b0Var.d && this.f51926e == b0Var.f51926e && this.f51927f == b0Var.f51927f && this.f51928g == b0Var.f51928g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51929i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f51926e;
        long j10 = this.f51927f;
        long j11 = this.f51928g;
        int hashCode2 = (((((((((((((this.f51923a ^ 1000003) * 1000003) ^ this.f51924b.hashCode()) * 1000003) ^ this.f51925c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51929i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51923a + ", processName=" + this.f51924b + ", reasonCode=" + this.f51925c + ", importance=" + this.d + ", pss=" + this.f51926e + ", rss=" + this.f51927f + ", timestamp=" + this.f51928g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51929i + "}";
    }
}
