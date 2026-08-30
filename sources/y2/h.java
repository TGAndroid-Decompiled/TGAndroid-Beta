package y2;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f47010a;
    public final Integer f47011b;
    public final l f47012c;
    public final long d;
    public final long e;
    public final Map f47013f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f47010a = str;
        this.f47011b = num;
        this.f47012c = lVar;
        this.d = j10;
        this.e = j11;
        this.f47013f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f47013f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f47013f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a9.a c() {
        ?? obj = new Object();
        String str = this.f47010a;
        if (str != null) {
            obj.f144b = str;
            obj.f143a = this.f47011b;
            l lVar = this.f47012c;
            if (lVar != null) {
                obj.f145c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f146f = new HashMap(this.f47013f);
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
            Integer num2 = hVar.f47011b;
            if (this.f47010a.equals(hVar.f47010a) && ((num = this.f47011b) != null ? num.equals(num2) : num2 == null) && this.f47012c.equals(hVar.f47012c) && this.d == hVar.d && this.e == hVar.e && this.f47013f.equals(hVar.f47013f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f47010a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f47011b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f47012c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f47013f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f47010a + ", code=" + this.f47011b + ", encodedPayload=" + this.f47012c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f47013f + "}";
    }
}
