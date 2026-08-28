package v2;

import java.util.ArrayList;
public final class l extends s {
    public final long f48296a;
    public final long f48297b;
    public final j f48298c;
    public final Integer d;
    public final String f48299e;
    public final ArrayList f48300f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f48310a;
        this.f48296a = j10;
        this.f48297b = j11;
        this.f48298c = jVar;
        this.d = num;
        this.f48299e = str;
        this.f48300f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f48310a;
                ArrayList arrayList = lVar.f48300f;
                String str = lVar.f48299e;
                Integer num = lVar.d;
                j jVar = lVar.f48298c;
                if (this.f48296a == lVar.f48296a && this.f48297b == lVar.f48297b && this.f48298c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f48299e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f48300f.equals(arrayList) && obj2.equals(obj2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f48296a;
        long j11 = this.f48297b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f48298c.hashCode()) * 1000003;
        int i9 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f48299e;
        if (str != null) {
            i9 = str.hashCode();
        }
        return w.f48310a.hashCode() ^ ((((i10 ^ i9) * 1000003) ^ this.f48300f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f48296a + ", requestUptimeMs=" + this.f48297b + ", clientInfo=" + this.f48298c + ", logSource=" + this.d + ", logSourceName=" + this.f48299e + ", logEvents=" + this.f48300f + ", qosTier=" + w.f48310a + "}";
    }
}
