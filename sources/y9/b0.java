package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51879a;
    public final String f51880b;
    public final int f51881c;
    public final int d;
    public final long f51882e;
    public final long f51883f;
    public final long f51884g;
    public final String h;
    public final List f51885i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f51879a = i10;
        this.f51880b = str;
        this.f51881c = i11;
        this.d = i12;
        this.f51882e = j3;
        this.f51883f = j10;
        this.f51884g = j11;
        this.h = str2;
        this.f51885i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51885i;
            String str2 = b0Var.h;
            if (this.f51879a == b0Var.f51879a && this.f51880b.equals(b0Var.f51880b) && this.f51881c == b0Var.f51881c && this.d == b0Var.d && this.f51882e == b0Var.f51882e && this.f51883f == b0Var.f51883f && this.f51884g == b0Var.f51884g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51885i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f51882e;
        long j10 = this.f51883f;
        long j11 = this.f51884g;
        int hashCode2 = (((((((((((((this.f51879a ^ 1000003) * 1000003) ^ this.f51880b.hashCode()) * 1000003) ^ this.f51881c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51885i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51879a + ", processName=" + this.f51880b + ", reasonCode=" + this.f51881c + ", importance=" + this.d + ", pss=" + this.f51882e + ", rss=" + this.f51883f + ", timestamp=" + this.f51884g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51885i + "}";
    }
}
