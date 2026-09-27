package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f46792a;
    public final String f46793b;
    public final int f46794c;
    public final int d;
    public final long e;
    public final long f46795f;
    public final long f46796g;
    public final String h;
    public final List f46797i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f46792a = i10;
        this.f46793b = str;
        this.f46794c = i11;
        this.d = i12;
        this.e = j3;
        this.f46795f = j10;
        this.f46796g = j11;
        this.h = str2;
        this.f46797i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f46797i;
            String str2 = b0Var.h;
            if (this.f46792a == b0Var.f46792a && this.f46793b.equals(b0Var.f46793b) && this.f46794c == b0Var.f46794c && this.d == b0Var.d && this.e == b0Var.e && this.f46795f == b0Var.f46795f && this.f46796g == b0Var.f46796g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f46797i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.e;
        long j10 = this.f46795f;
        long j11 = this.f46796g;
        int hashCode2 = (((((((((((((this.f46792a ^ 1000003) * 1000003) ^ this.f46793b.hashCode()) * 1000003) ^ this.f46794c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f46797i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f46792a + ", processName=" + this.f46793b + ", reasonCode=" + this.f46794c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f46795f + ", timestamp=" + this.f46796g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f46797i + "}";
    }
}
