package y9;

import java.util.List;
public final class b0 extends g1 {
    public final int f52111a;
    public final String f52112b;
    public final int f52113c;
    public final int d;
    public final long f52114e;
    public final long f52115f;
    public final long f52116g;
    public final String h;
    public final List f52117i;

    public b0(int i10, String str, int i11, int i12, long j3, long j10, long j11, String str2, List list) {
        this.f52111a = i10;
        this.f52112b = str;
        this.f52113c = i11;
        this.d = i12;
        this.f52114e = j3;
        this.f52115f = j10;
        this.f52116g = j11;
        this.h = str2;
        this.f52117i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f52117i;
            String str2 = b0Var.h;
            if (this.f52111a == b0Var.f52111a && this.f52112b.equals(b0Var.f52112b) && this.f52113c == b0Var.f52113c && this.d == b0Var.d && this.f52114e == b0Var.f52114e && this.f52115f == b0Var.f52115f && this.f52116g == b0Var.f52116g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f52117i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52114e;
        long j10 = this.f52115f;
        long j11 = this.f52116g;
        int hashCode2 = (((((((((((((this.f52111a ^ 1000003) * 1000003) ^ this.f52112b.hashCode()) * 1000003) ^ this.f52113c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f52117i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f52111a + ", processName=" + this.f52112b + ", reasonCode=" + this.f52113c + ", importance=" + this.d + ", pss=" + this.f52114e + ", rss=" + this.f52115f + ", timestamp=" + this.f52116g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f52117i + "}";
    }
}
