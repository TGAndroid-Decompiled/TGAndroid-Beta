package y2;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f47104a;
    public final Integer f47105b;
    public final l f47106c;
    public final long d;
    public final long e;
    public final Map f47107f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f47104a = str;
        this.f47105b = num;
        this.f47106c = lVar;
        this.d = j10;
        this.e = j11;
        this.f47107f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f47107f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f47107f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a9.a c() {
        ?? obj = new Object();
        String str = this.f47104a;
        if (str != null) {
            obj.f143b = str;
            obj.f142a = this.f47105b;
            l lVar = this.f47106c;
            if (lVar != null) {
                obj.f144c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f145f = new HashMap(this.f47107f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f47105b;
            if (this.f47104a.equals(hVar.f47104a) && ((num = this.f47105b) != null ? num.equals(num2) : num2 == null) && this.f47106c.equals(hVar.f47106c) && this.d == hVar.d && this.e == hVar.e && this.f47107f.equals(hVar.f47107f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f47104a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f47105b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f47106c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f47107f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f47104a + ", code=" + this.f47105b + ", encodedPayload=" + this.f47106c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f47107f + "}";
    }
}
