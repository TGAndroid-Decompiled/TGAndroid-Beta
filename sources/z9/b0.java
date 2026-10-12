package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f49928a;
    public final String f49929b;
    public final int f49930c;
    public final int d;
    public final long e;
    public final long f49931f;
    public final long f49932g;
    public final String h;
    public final List f49933i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f49928a = i10;
        this.f49929b = str;
        this.f49930c = i11;
        this.d = i12;
        this.e = j10;
        this.f49931f = j11;
        this.f49932g = j12;
        this.h = str2;
        this.f49933i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f49933i;
            String str2 = b0Var.h;
            if (this.f49928a == b0Var.f49928a && this.f49929b.equals(b0Var.f49929b) && this.f49930c == b0Var.f49930c && this.d == b0Var.d && this.e == b0Var.e && this.f49931f == b0Var.f49931f && this.f49932g == b0Var.f49932g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f49933i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f49931f;
        long j12 = this.f49932g;
        int hashCode2 = (((((((((((((this.f49928a ^ 1000003) * 1000003) ^ this.f49929b.hashCode()) * 1000003) ^ this.f49930c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f49933i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f49928a + ", processName=" + this.f49929b + ", reasonCode=" + this.f49930c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f49931f + ", timestamp=" + this.f49932g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f49933i + "}";
    }
}
