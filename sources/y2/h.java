package y2;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f50725a;
    public final Integer f50726b;
    public final l f50727c;
    public final long d;
    public final long f50728e;
    public final Map f50729f;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f50725a = str;
        this.f50726b = num;
        this.f50727c = lVar;
        this.d = j10;
        this.f50728e = j11;
        this.f50729f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f50729f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f50729f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a9.a c() {
        ?? obj = new Object();
        String str = this.f50725a;
        if (str != null) {
            obj.f156b = str;
            obj.f155a = this.f50726b;
            l lVar = this.f50727c;
            if (lVar != null) {
                obj.f157c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f158e = Long.valueOf(this.f50728e);
                obj.f159f = new HashMap(this.f50729f);
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
            Integer num2 = hVar.f50726b;
            if (this.f50725a.equals(hVar.f50725a) && ((num = this.f50726b) != null ? num.equals(num2) : num2 == null) && this.f50727c.equals(hVar.f50727c) && this.d == hVar.d && this.f50728e == hVar.f50728e && this.f50729f.equals(hVar.f50729f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50725a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f50726b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f50728e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f50727c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50729f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f50725a + ", code=" + this.f50726b + ", encodedPayload=" + this.f50727c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f50728e + ", autoMetadata=" + this.f50729f + "}";
    }
}
