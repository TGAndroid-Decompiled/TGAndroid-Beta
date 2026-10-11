package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51966a;
    public final String f51967b;
    public final int f51968c;
    public final int d;
    public final long f51969e;
    public final long f51970f;
    public final long f51971g;
    public final String h;
    public final List f51972i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f51966a = i10;
        this.f51967b = str;
        this.f51968c = i11;
        this.d = i12;
        this.f51969e = j3;
        this.f51970f = j10;
        this.f51971g = j11;
        this.h = str2;
        this.f51972i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51972i;
            String str2 = b0Var.h;
            if (this.f51966a == b0Var.f51966a && this.f51967b.equals(b0Var.f51967b) && this.f51968c == b0Var.f51968c && this.d == b0Var.d && this.f51969e == b0Var.f51969e && this.f51970f == b0Var.f51970f && this.f51971g == b0Var.f51971g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51972i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f51969e;
        long j10 = this.f51970f;
        long j11 = this.f51971g;
        int hashCode2 = (((((((((((((this.f51966a ^ 1000003) * 1000003) ^ this.f51967b.hashCode()) * 1000003) ^ this.f51968c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51972i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51966a + ", processName=" + this.f51967b + ", reasonCode=" + this.f51968c + ", importance=" + this.d + ", pss=" + this.f51969e + ", rss=" + this.f51970f + ", timestamp=" + this.f51971g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51972i + "}";
    }
}
