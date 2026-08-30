package x2;

import java.util.ArrayList;
public final class l extends s {
    public final long f46689a;
    public final long f46690b;
    public final j f46691c;
    public final Integer d;
    public final String e;
    public final ArrayList f46692f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f46702a;
        this.f46689a = j10;
        this.f46690b = j11;
        this.f46691c = jVar;
        this.d = num;
        this.e = str;
        this.f46692f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f46702a;
                ArrayList arrayList = lVar.f46692f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f46691c;
                if (this.f46689a == lVar.f46689a && this.f46690b == lVar.f46690b && this.f46691c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f46692f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f46689a;
        long j11 = this.f46690b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f46691c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return w.f46702a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f46692f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f46689a + ", requestUptimeMs=" + this.f46690b + ", clientInfo=" + this.f46691c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f46692f + ", qosTier=" + w.f46702a + "}";
    }
}
