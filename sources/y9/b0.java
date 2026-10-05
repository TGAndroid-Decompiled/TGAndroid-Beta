package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f50598a;
    public final String f50599b;
    public final int f50600c;
    public final int d;
    public final long f50601e;
    public final long f50602f;
    public final long f50603g;
    public final String h;
    public final List f50604i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f50598a = i10;
        this.f50599b = str;
        this.f50600c = i11;
        this.d = i12;
        this.f50601e = j3;
        this.f50602f = j10;
        this.f50603g = j11;
        this.h = str2;
        this.f50604i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f50604i;
            String str2 = b0Var.h;
            if (this.f50598a == b0Var.f50598a && this.f50599b.equals(b0Var.f50599b) && this.f50600c == b0Var.f50600c && this.d == b0Var.d && this.f50601e == b0Var.f50601e && this.f50602f == b0Var.f50602f && this.f50603g == b0Var.f50603g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f50604i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f50601e;
        long j10 = this.f50602f;
        long j11 = this.f50603g;
        int hashCode2 = (((((((((((((this.f50598a ^ 1000003) * 1000003) ^ this.f50599b.hashCode()) * 1000003) ^ this.f50600c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f50604i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f50598a + ", processName=" + this.f50599b + ", reasonCode=" + this.f50600c + ", importance=" + this.d + ", pss=" + this.f50601e + ", rss=" + this.f50602f + ", timestamp=" + this.f50603g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f50604i + "}";
    }
}
