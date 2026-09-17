package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f49702a;
    public final String f49703b;
    public final int f49704c;
    public final int d;
    public final long f49705e;
    public final long f49706f;
    public final long f49707g;
    public final String h;
    public final List f49708i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f49702a = i10;
        this.f49703b = str;
        this.f49704c = i11;
        this.d = i12;
        this.f49705e = j3;
        this.f49706f = j10;
        this.f49707g = j11;
        this.h = str2;
        this.f49708i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f49708i;
            String str2 = b0Var.h;
            if (this.f49702a == b0Var.f49702a && this.f49703b.equals(b0Var.f49703b) && this.f49704c == b0Var.f49704c && this.d == b0Var.d && this.f49705e == b0Var.f49705e && this.f49706f == b0Var.f49706f && this.f49707g == b0Var.f49707g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f49708i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49705e;
        long j10 = this.f49706f;
        long j11 = this.f49707g;
        int hashCode2 = (((((((((((((this.f49702a ^ 1000003) * 1000003) ^ this.f49703b.hashCode()) * 1000003) ^ this.f49704c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f49708i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f49702a + ", processName=" + this.f49703b + ", reasonCode=" + this.f49704c + ", importance=" + this.d + ", pss=" + this.f49705e + ", rss=" + this.f49706f + ", timestamp=" + this.f49707g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f49708i + "}";
    }
}
