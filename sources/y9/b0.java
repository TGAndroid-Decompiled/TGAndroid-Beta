package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f52103a;
    public final String f52104b;
    public final int f52105c;
    public final int d;
    public final long f52106e;
    public final long f52107f;
    public final long f52108g;
    public final String h;
    public final List f52109i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f52103a = i10;
        this.f52104b = str;
        this.f52105c = i11;
        this.d = i12;
        this.f52106e = j3;
        this.f52107f = j10;
        this.f52108g = j11;
        this.h = str2;
        this.f52109i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f52109i;
            String str2 = b0Var.h;
            if (this.f52103a == b0Var.f52103a && this.f52104b.equals(b0Var.f52104b) && this.f52105c == b0Var.f52105c && this.d == b0Var.d && this.f52106e == b0Var.f52106e && this.f52107f == b0Var.f52107f && this.f52108g == b0Var.f52108g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f52109i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52106e;
        long j10 = this.f52107f;
        long j11 = this.f52108g;
        int hashCode2 = (((((((((((((this.f52103a ^ 1000003) * 1000003) ^ this.f52104b.hashCode()) * 1000003) ^ this.f52105c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f52109i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f52103a + ", processName=" + this.f52104b + ", reasonCode=" + this.f52105c + ", importance=" + this.d + ", pss=" + this.f52106e + ", rss=" + this.f52107f + ", timestamp=" + this.f52108g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f52109i + "}";
    }
}
