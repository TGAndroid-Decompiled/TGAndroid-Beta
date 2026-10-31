package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f55231a;
    public final String f55232b;
    public final int f55233c;
    public final int d;
    public final long e;
    public final long f55234f;
    public final long f55235g;
    public final String h;
    public final List f55236i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f55231a = i10;
        this.f55232b = str;
        this.f55233c = i11;
        this.d = i12;
        this.e = j10;
        this.f55234f = j11;
        this.f55235g = j12;
        this.h = str2;
        this.f55236i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f55236i;
            String str2 = b0Var.h;
            if (this.f55231a == b0Var.f55231a && this.f55232b.equals(b0Var.f55232b) && this.f55233c == b0Var.f55233c && this.d == b0Var.d && this.e == b0Var.e && this.f55234f == b0Var.f55234f && this.f55235g == b0Var.f55235g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f55236i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f55234f;
        long j12 = this.f55235g;
        int hashCode2 = (((((((((((((this.f55231a ^ 1000003) * 1000003) ^ this.f55232b.hashCode()) * 1000003) ^ this.f55233c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f55236i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f55231a + ", processName=" + this.f55232b + ", reasonCode=" + this.f55233c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f55234f + ", timestamp=" + this.f55235g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f55236i + "}";
    }
}
