package v2;

import java.util.Arrays;

public final class k extends r {

    public final long f48717a;

    public final Integer f48718b;

    public final long f48719c;
    public final byte[] d;

    public final String f48720e;

    public final long f48721f;

    public final v f48722g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, v vVar) {
        this.f48717a = j10;
        this.f48718b = num;
        this.f48719c = j11;
        this.d = bArr;
        this.f48720e = str;
        this.f48721f = j12;
        this.f48722g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f48722g;
            String str2 = kVar.f48720e;
            Integer num2 = kVar.f48718b;
            if (this.f48717a == kVar.f48717a && ((num = this.f48718b) != null ? num.equals(num2) : num2 == null) && this.f48719c == kVar.f48719c) {
                if (Arrays.equals(this.d, rVar instanceof k ? ((k) rVar).d : kVar.d) && ((str = this.f48720e) != null ? str.equals(str2) : str2 == null) && this.f48721f == kVar.f48721f && ((vVar = this.f48722g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48717a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f48718b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f48719c;
        int iHashCode2 = (((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f48720e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f48721f;
        int i11 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        v vVar = this.f48722g;
        return i11 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f48717a + ", eventCode=" + this.f48718b + ", eventUptimeMs=" + this.f48719c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f48720e + ", timezoneOffsetSeconds=" + this.f48721f + ", networkConnectionInfo=" + this.f48722g + "}";
    }
}
