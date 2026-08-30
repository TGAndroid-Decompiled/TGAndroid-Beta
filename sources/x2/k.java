package x2;

import java.util.Arrays;
public final class k extends r {
    public final long f46684a;
    public final Integer f46685b;
    public final long f46686c;
    public final byte[] d;
    public final String e;
    public final long f46687f;
    public final v f46688g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, v vVar) {
        this.f46684a = j10;
        this.f46685b = num;
        this.f46686c = j11;
        this.d = bArr;
        this.e = str;
        this.f46687f = j12;
        this.f46688g = vVar;
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
            v vVar2 = kVar.f46688g;
            String str2 = kVar.e;
            Integer num2 = kVar.f46685b;
            if (this.f46684a == kVar.f46684a && ((num = this.f46685b) != null ? num.equals(num2) : num2 == null) && this.f46686c == kVar.f46686c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f46687f == kVar.f46687f && ((vVar = this.f46688g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f46684a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f46685b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.f46686c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f46687f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        v vVar = this.f46688g;
        if (vVar != null) {
            i11 = vVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f46684a + ", eventCode=" + this.f46685b + ", eventUptimeMs=" + this.f46686c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f46687f + ", networkConnectionInfo=" + this.f46688g + "}";
    }
}
