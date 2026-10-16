package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f49929a;
    public final String f49930b;
    public final int f49931c;
    public final int d;
    public final long e;
    public final long f49932f;
    public final long f49933g;
    public final String h;
    public final List f49934i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f49929a = i10;
        this.f49930b = str;
        this.f49931c = i11;
        this.d = i12;
        this.e = j10;
        this.f49932f = j11;
        this.f49933g = j12;
        this.h = str2;
        this.f49934i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f49934i;
            String str2 = b0Var.h;
            if (this.f49929a == b0Var.f49929a && this.f49930b.equals(b0Var.f49930b) && this.f49931c == b0Var.f49931c && this.d == b0Var.d && this.e == b0Var.e && this.f49932f == b0Var.f49932f && this.f49933g == b0Var.f49933g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f49934i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f49932f;
        long j12 = this.f49933g;
        int hashCode2 = (((((((((((((this.f49929a ^ 1000003) * 1000003) ^ this.f49930b.hashCode()) * 1000003) ^ this.f49931c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f49934i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f49929a + ", processName=" + this.f49930b + ", reasonCode=" + this.f49931c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f49932f + ", timestamp=" + this.f49933g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f49934i + "}";
    }
}
