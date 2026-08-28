package v2;

import java.util.Arrays;
public final class k extends r {
    public final long f48290a;
    public final Integer f48291b;
    public final long f48292c;
    public final byte[] d;
    public final String f48293e;
    public final long f48294f;
    public final v f48295g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, v vVar) {
        this.f48290a = j10;
        this.f48291b = num;
        this.f48292c = j11;
        this.d = bArr;
        this.f48293e = str;
        this.f48294f = j12;
        this.f48295g = vVar;
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
            v vVar2 = kVar.f48295g;
            String str2 = kVar.f48293e;
            Integer num2 = kVar.f48291b;
            if (this.f48290a == kVar.f48290a && ((num = this.f48291b) != null ? num.equals(num2) : num2 == null) && this.f48292c == kVar.f48292c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr) && ((str = this.f48293e) != null ? str.equals(str2) : str2 == null) && this.f48294f == kVar.f48294f && ((vVar = this.f48295g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f48290a;
        int i9 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f48291b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.f48292c;
        int hashCode3 = (((((i9 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f48293e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f48294f;
        int i11 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        v vVar = this.f48295g;
        if (vVar != null) {
            i10 = vVar.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f48290a + ", eventCode=" + this.f48291b + ", eventUptimeMs=" + this.f48292c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f48293e + ", timezoneOffsetSeconds=" + this.f48294f + ", networkConnectionInfo=" + this.f48295g + "}";
    }
}
