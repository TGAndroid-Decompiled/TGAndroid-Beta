package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f49730a;
    public final String f49731b;
    public final int f49732c;
    public final int d;
    public final long f49733e;
    public final long f49734f;
    public final long f49735g;
    public final String h;
    public final List f49736i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f49730a = i10;
        this.f49731b = str;
        this.f49732c = i11;
        this.d = i12;
        this.f49733e = j3;
        this.f49734f = j10;
        this.f49735g = j11;
        this.h = str2;
        this.f49736i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f49736i;
            String str2 = b0Var.h;
            if (this.f49730a == b0Var.f49730a && this.f49731b.equals(b0Var.f49731b) && this.f49732c == b0Var.f49732c && this.d == b0Var.d && this.f49733e == b0Var.f49733e && this.f49734f == b0Var.f49734f && this.f49735g == b0Var.f49735g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f49736i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49733e;
        long j10 = this.f49734f;
        long j11 = this.f49735g;
        int hashCode2 = (((((((((((((this.f49730a ^ 1000003) * 1000003) ^ this.f49731b.hashCode()) * 1000003) ^ this.f49732c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f49736i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f49730a + ", processName=" + this.f49731b + ", reasonCode=" + this.f49732c + ", importance=" + this.d + ", pss=" + this.f49733e + ", rss=" + this.f49734f + ", timestamp=" + this.f49735g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f49736i + "}";
    }
}
