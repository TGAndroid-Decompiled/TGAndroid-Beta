package y2;

import bg.c2;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f50182a;
    public final Integer f50183b;
    public final l f50184c;
    public final long d;
    public final long f50185e;
    public final Map f50186f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f50182a = str;
        this.f50183b = num;
        this.f50184c = lVar;
        this.d = j10;
        this.f50185e = j11;
        this.f50186f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f50186f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f50186f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final c2 c() {
        ?? obj = new Object();
        String str = this.f50182a;
        if (str != null) {
            obj.f2118a = str;
            obj.f2119b = this.f50183b;
            l lVar = this.f50184c;
            if (lVar != null) {
                obj.f2120c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f2121e = Long.valueOf(this.f50185e);
                obj.f2122f = new HashMap(this.f50186f);
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
            Integer num2 = hVar.f50183b;
            if (this.f50182a.equals(hVar.f50182a) && ((num = this.f50183b) != null ? num.equals(num2) : num2 == null) && this.f50184c.equals(hVar.f50184c) && this.d == hVar.d && this.f50185e == hVar.f50185e && this.f50186f.equals(hVar.f50186f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50182a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f50183b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f50185e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f50184c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50186f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f50182a + ", code=" + this.f50183b + ", encodedPayload=" + this.f50184c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f50185e + ", autoMetadata=" + this.f50186f + "}";
    }
}
