package z9;

import java.util.List;
public final class b0 extends g1 {
    public final int f51312a;
    public final String f51313b;
    public final int f51314c;
    public final int d;
    public final long e;
    public final long f51315f;
    public final long f51316g;
    public final String h;
    public final List f51317i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f51312a = i10;
        this.f51313b = str;
        this.f51314c = i11;
        this.d = i12;
        this.e = j10;
        this.f51315f = j11;
        this.f51316g = j12;
        this.h = str2;
        this.f51317i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f51317i;
            String str2 = b0Var.h;
            if (this.f51312a == b0Var.f51312a && this.f51313b.equals(b0Var.f51313b) && this.f51314c == b0Var.f51314c && this.d == b0Var.d && this.e == b0Var.e && this.f51315f == b0Var.f51315f && this.f51316g == b0Var.f51316g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f51317i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f51315f;
        long j12 = this.f51316g;
        int hashCode2 = (((((((((((((this.f51312a ^ 1000003) * 1000003) ^ this.f51313b.hashCode()) * 1000003) ^ this.f51314c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f51317i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f51312a + ", processName=" + this.f51313b + ", reasonCode=" + this.f51314c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f51315f + ", timestamp=" + this.f51316g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f51317i + "}";
    }
}
