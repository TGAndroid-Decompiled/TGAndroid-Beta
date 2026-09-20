package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f46770a;
    public final String f46771b;
    public final int f46772c;
    public final int d;
    public final long e;
    public final long f46773f;
    public final long f46774g;
    public final String h;
    public final List f46775i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f46770a = i10;
        this.f46771b = str;
        this.f46772c = i11;
        this.d = i12;
        this.e = j3;
        this.f46773f = j10;
        this.f46774g = j11;
        this.h = str2;
        this.f46775i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f46775i;
            String str2 = b0Var.h;
            if (this.f46770a == b0Var.f46770a && this.f46771b.equals(b0Var.f46771b) && this.f46772c == b0Var.f46772c && this.d == b0Var.d && this.e == b0Var.e && this.f46773f == b0Var.f46773f && this.f46774g == b0Var.f46774g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f46775i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.e;
        long j10 = this.f46773f;
        long j11 = this.f46774g;
        int hashCode2 = (((((((((((((this.f46770a ^ 1000003) * 1000003) ^ this.f46771b.hashCode()) * 1000003) ^ this.f46772c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f46775i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f46770a + ", processName=" + this.f46771b + ", reasonCode=" + this.f46772c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f46773f + ", timestamp=" + this.f46774g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f46775i + "}";
    }
}
