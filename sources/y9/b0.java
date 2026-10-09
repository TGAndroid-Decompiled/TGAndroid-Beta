package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51877a;
    public final String f51878b;
    public final int f51879c;
    public final int d;
    public final long f51880e;
    public final long f51881f;
    public final long f51882g;
    public final String h;
    public final List f51883i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f51877a = i10;
        this.f51878b = str;
        this.f51879c = i11;
        this.d = i12;
        this.f51880e = j3;
        this.f51881f = j10;
        this.f51882g = j11;
        this.h = str2;
        this.f51883i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51883i;
            String str2 = b0Var.h;
            if (this.f51877a == b0Var.f51877a && this.f51878b.equals(b0Var.f51878b) && this.f51879c == b0Var.f51879c && this.d == b0Var.d && this.f51880e == b0Var.f51880e && this.f51881f == b0Var.f51881f && this.f51882g == b0Var.f51882g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51883i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f51880e;
        long j10 = this.f51881f;
        long j11 = this.f51882g;
        int hashCode2 = (((((((((((((this.f51877a ^ 1000003) * 1000003) ^ this.f51878b.hashCode()) * 1000003) ^ this.f51879c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51883i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51877a + ", processName=" + this.f51878b + ", reasonCode=" + this.f51879c + ", importance=" + this.d + ", pss=" + this.f51880e + ", rss=" + this.f51881f + ", timestamp=" + this.f51882g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51883i + "}";
    }
}
