package x2;

import java.util.Arrays;
public final class k extends r {
    public final long f50315a;
    public final Integer f50316b;
    public final long f50317c;
    public final byte[] d;
    public final String f50318e;
    public final long f50319f;
    public final v f50320g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, v vVar) {
        this.f50315a = j10;
        this.f50316b = num;
        this.f50317c = j11;
        this.d = bArr;
        this.f50318e = str;
        this.f50319f = j12;
        this.f50320g = vVar;
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
            v vVar2 = kVar.f50320g;
            String str2 = kVar.f50318e;
            Integer num2 = kVar.f50316b;
            if (this.f50315a == kVar.f50315a && ((num = this.f50316b) != null ? num.equals(num2) : num2 == null) && this.f50317c == kVar.f50317c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr) && ((str = this.f50318e) != null ? str.equals(str2) : str2 == null) && this.f50319f == kVar.f50319f && ((vVar = this.f50320g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f50315a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f50316b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.f50317c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f50318e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f50319f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        v vVar = this.f50320g;
        if (vVar != null) {
            i11 = vVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f50315a + ", eventCode=" + this.f50316b + ", eventUptimeMs=" + this.f50317c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f50318e + ", timezoneOffsetSeconds=" + this.f50319f + ", networkConnectionInfo=" + this.f50320g + "}";
    }
}
