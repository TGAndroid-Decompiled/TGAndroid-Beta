package w2;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f48449a;
    public final Integer f48450b;
    public final l f48451c;
    public final long d;
    public final long f48452e;
    public final Map f48453f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f48449a = str;
        this.f48450b = num;
        this.f48451c = lVar;
        this.d = j10;
        this.f48452e = j11;
        this.f48453f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f48453f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f48453f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.m c() {
        ?? obj = new Object();
        String str = this.f48449a;
        if (str != null) {
            obj.f4160a = str;
            obj.f4161b = this.f48450b;
            l lVar = this.f48451c;
            if (lVar != null) {
                obj.f4162c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f4163e = Long.valueOf(this.f48452e);
                obj.f4164f = new HashMap(this.f48453f);
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
            Integer num2 = hVar.f48450b;
            if (this.f48449a.equals(hVar.f48449a) && ((num = this.f48450b) != null ? num.equals(num2) : num2 == null) && this.f48451c.equals(hVar.f48451c) && this.d == hVar.d && this.f48452e == hVar.f48452e && this.f48453f.equals(hVar.f48453f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f48449a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f48450b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f48452e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f48451c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f48453f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f48449a + ", code=" + this.f48450b + ", encodedPayload=" + this.f48451c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f48452e + ", autoMetadata=" + this.f48453f + "}";
    }
}
