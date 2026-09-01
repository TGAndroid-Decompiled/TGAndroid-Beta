package y2;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f50689a;
    public final Integer f50690b;
    public final l f50691c;
    public final long d;
    public final long f50692e;
    public final Map f50693f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f50689a = str;
        this.f50690b = num;
        this.f50691c = lVar;
        this.d = j10;
        this.f50692e = j11;
        this.f50693f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f50693f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f50693f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a9.a c() {
        ?? obj = new Object();
        String str = this.f50689a;
        if (str != null) {
            obj.f156b = str;
            obj.f155a = this.f50690b;
            l lVar = this.f50691c;
            if (lVar != null) {
                obj.f157c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f158e = Long.valueOf(this.f50692e);
                obj.f159f = new HashMap(this.f50693f);
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
            Integer num2 = hVar.f50690b;
            if (this.f50689a.equals(hVar.f50689a) && ((num = this.f50690b) != null ? num.equals(num2) : num2 == null) && this.f50691c.equals(hVar.f50691c) && this.d == hVar.d && this.f50692e == hVar.f50692e && this.f50693f.equals(hVar.f50693f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50689a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f50690b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f50692e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f50691c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50693f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f50689a + ", code=" + this.f50690b + ", encodedPayload=" + this.f50691c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f50692e + ", autoMetadata=" + this.f50693f + "}";
    }
}
