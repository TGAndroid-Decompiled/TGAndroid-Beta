package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f46746a;
    public final String f46747b;
    public final int f46748c;
    public final int d;
    public final long e;
    public final long f46749f;
    public final long f46750g;
    public final String h;
    public final List f46751i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f46746a = i10;
        this.f46747b = str;
        this.f46748c = i11;
        this.d = i12;
        this.e = j3;
        this.f46749f = j10;
        this.f46750g = j11;
        this.h = str2;
        this.f46751i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f46751i;
            String str2 = b0Var.h;
            if (this.f46746a == b0Var.f46746a && this.f46747b.equals(b0Var.f46747b) && this.f46748c == b0Var.f46748c && this.d == b0Var.d && this.e == b0Var.e && this.f46749f == b0Var.f46749f && this.f46750g == b0Var.f46750g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f46751i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.e;
        long j10 = this.f46749f;
        long j11 = this.f46750g;
        int hashCode2 = (((((((((((((this.f46746a ^ 1000003) * 1000003) ^ this.f46747b.hashCode()) * 1000003) ^ this.f46748c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f46751i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f46746a + ", processName=" + this.f46747b + ", reasonCode=" + this.f46748c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f46749f + ", timestamp=" + this.f46750g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f46751i + "}";
    }
}
