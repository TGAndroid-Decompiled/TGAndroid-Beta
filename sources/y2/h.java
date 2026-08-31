package y2;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f50688a;
    public final Integer f50689b;
    public final l f50690c;
    public final long d;
    public final long f50691e;
    public final Map f50692f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f50688a = str;
        this.f50689b = num;
        this.f50690c = lVar;
        this.d = j10;
        this.f50691e = j11;
        this.f50692f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f50692f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f50692f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a9.a c() {
        ?? obj = new Object();
        String str = this.f50688a;
        if (str != null) {
            obj.f156b = str;
            obj.f155a = this.f50689b;
            l lVar = this.f50690c;
            if (lVar != null) {
                obj.f157c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f158e = Long.valueOf(this.f50691e);
                obj.f159f = new HashMap(this.f50692f);
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
            Integer num2 = hVar.f50689b;
            if (this.f50688a.equals(hVar.f50688a) && ((num = this.f50689b) != null ? num.equals(num2) : num2 == null) && this.f50690c.equals(hVar.f50690c) && this.d == hVar.d && this.f50691e == hVar.f50691e && this.f50692f.equals(hVar.f50692f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50688a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f50689b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f50691e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f50690c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50692f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f50688a + ", code=" + this.f50689b + ", encodedPayload=" + this.f50690c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f50691e + ", autoMetadata=" + this.f50692f + "}";
    }
}
