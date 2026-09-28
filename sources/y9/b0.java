package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f46747a;
    public final String f46748b;
    public final int f46749c;
    public final int d;
    public final long e;
    public final long f46750f;
    public final long f46751g;
    public final String h;
    public final List f46752i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f46747a = i10;
        this.f46748b = str;
        this.f46749c = i11;
        this.d = i12;
        this.e = j3;
        this.f46750f = j10;
        this.f46751g = j11;
        this.h = str2;
        this.f46752i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f46752i;
            String str2 = b0Var.h;
            if (this.f46747a == b0Var.f46747a && this.f46748b.equals(b0Var.f46748b) && this.f46749c == b0Var.f46749c && this.d == b0Var.d && this.e == b0Var.e && this.f46750f == b0Var.f46750f && this.f46751g == b0Var.f46751g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f46752i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.e;
        long j10 = this.f46750f;
        long j11 = this.f46751g;
        int hashCode2 = (((((((((((((this.f46747a ^ 1000003) * 1000003) ^ this.f46748b.hashCode()) * 1000003) ^ this.f46749c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f46752i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f46747a + ", processName=" + this.f46748b + ", reasonCode=" + this.f46749c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f46750f + ", timestamp=" + this.f46751g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f46752i + "}";
    }
}
