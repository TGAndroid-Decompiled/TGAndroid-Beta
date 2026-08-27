package w2;

import java.util.HashMap;
import java.util.Map;

public final class h {

    public final String f48952a;

    public final Integer f48953b;

    public final l f48954c;
    public final long d;

    public final long f48955e;

    public final Map f48956f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap map) {
        this.f48952a = str;
        this.f48953b = num;
        this.f48954c = lVar;
        this.d = j10;
        this.f48955e = j11;
        this.f48956f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f48956f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f48956f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.m c() {
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        String str = this.f48952a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        mVar.f4602a = str;
        mVar.f4603b = this.f48953b;
        l lVar = this.f48954c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        mVar.f4604c = lVar;
        mVar.d = Long.valueOf(this.d);
        mVar.f4605e = Long.valueOf(this.f48955e);
        mVar.f4606f = new HashMap(this.f48956f);
        return mVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f48953b;
            if (this.f48952a.equals(hVar.f48952a) && ((num = this.f48953b) != null ? num.equals(num2) : num2 == null) && this.f48954c.equals(hVar.f48954c) && this.d == hVar.d && this.f48955e == hVar.f48955e && this.f48956f.equals(hVar.f48956f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f48952a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f48953b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f48954c.hashCode()) * 1000003;
        long j10 = this.d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f48955e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f48956f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f48952a + ", code=" + this.f48953b + ", encodedPayload=" + this.f48954c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f48955e + ", autoMetadata=" + this.f48956f + "}";
    }
}
