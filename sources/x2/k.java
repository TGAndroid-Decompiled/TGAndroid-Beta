package x2;

import java.util.Arrays;
public final class k extends r {
    public final long f50279a;
    public final Integer f50280b;
    public final long f50281c;
    public final byte[] d;
    public final String f50282e;
    public final long f50283f;
    public final v f50284g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, v vVar) {
        this.f50279a = j10;
        this.f50280b = num;
        this.f50281c = j11;
        this.d = bArr;
        this.f50282e = str;
        this.f50283f = j12;
        this.f50284g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f50284g;
            String str2 = kVar.f50282e;
            Integer num2 = kVar.f50280b;
            if (this.f50279a == kVar.f50279a && ((num = this.f50280b) != null ? num.equals(num2) : num2 == null) && this.f50281c == kVar.f50281c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr) && ((str = this.f50282e) != null ? str.equals(str2) : str2 == null) && this.f50283f == kVar.f50283f && ((vVar = this.f50284g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f50279a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f50280b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.f50281c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f50282e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f50283f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        v vVar = this.f50284g;
        if (vVar != null) {
            i11 = vVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f50279a + ", eventCode=" + this.f50280b + ", eventUptimeMs=" + this.f50281c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f50282e + ", timezoneOffsetSeconds=" + this.f50283f + ", networkConnectionInfo=" + this.f50284g + "}";
    }
}
