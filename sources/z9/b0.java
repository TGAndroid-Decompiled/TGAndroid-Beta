package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51334a;
    public final String f51335b;
    public final int f51336c;
    public final int d;
    public final long e;
    public final long f51337f;
    public final long f51338g;
    public final String h;
    public final List f51339i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f51334a = i10;
        this.f51335b = str;
        this.f51336c = i11;
        this.d = i12;
        this.e = j10;
        this.f51337f = j11;
        this.f51338g = j12;
        this.h = str2;
        this.f51339i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51339i;
            String str2 = b0Var.h;
            if (this.f51334a == b0Var.f51334a && this.f51335b.equals(b0Var.f51335b) && this.f51336c == b0Var.f51336c && this.d == b0Var.d && this.e == b0Var.e && this.f51337f == b0Var.f51337f && this.f51338g == b0Var.f51338g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51339i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f51337f;
        long j12 = this.f51338g;
        int hashCode2 = (((((((((((((this.f51334a ^ 1000003) * 1000003) ^ this.f51335b.hashCode()) * 1000003) ^ this.f51336c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51339i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51334a + ", processName=" + this.f51335b + ", reasonCode=" + this.f51336c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f51337f + ", timestamp=" + this.f51338g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51339i + "}";
    }
}
