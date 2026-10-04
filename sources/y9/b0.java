package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f50591a;
    public final String f50592b;
    public final int f50593c;
    public final int d;
    public final long f50594e;
    public final long f50595f;
    public final long f50596g;
    public final String h;
    public final List f50597i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f50591a = i10;
        this.f50592b = str;
        this.f50593c = i11;
        this.d = i12;
        this.f50594e = j3;
        this.f50595f = j10;
        this.f50596g = j11;
        this.h = str2;
        this.f50597i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f50597i;
            String str2 = b0Var.h;
            if (this.f50591a == b0Var.f50591a && this.f50592b.equals(b0Var.f50592b) && this.f50593c == b0Var.f50593c && this.d == b0Var.d && this.f50594e == b0Var.f50594e && this.f50595f == b0Var.f50595f && this.f50596g == b0Var.f50596g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f50597i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f50594e;
        long j10 = this.f50595f;
        long j11 = this.f50596g;
        int hashCode2 = (((((((((((((this.f50591a ^ 1000003) * 1000003) ^ this.f50592b.hashCode()) * 1000003) ^ this.f50593c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f50597i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f50591a + ", processName=" + this.f50592b + ", reasonCode=" + this.f50593c + ", importance=" + this.d + ", pss=" + this.f50594e + ", rss=" + this.f50595f + ", timestamp=" + this.f50596g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f50597i + "}";
    }
}
