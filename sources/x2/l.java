package x2;

import java.util.ArrayList;
public final class l extends s {
    public final long f50284a;
    public final long f50285b;
    public final j f50286c;
    public final Integer d;
    public final String f50287e;
    public final ArrayList f50288f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f50298a;
        this.f50284a = j10;
        this.f50285b = j11;
        this.f50286c = jVar;
        this.d = num;
        this.f50287e = str;
        this.f50288f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f50298a;
                ArrayList arrayList = lVar.f50288f;
                String str = lVar.f50287e;
                Integer num = lVar.d;
                j jVar = lVar.f50286c;
                if (this.f50284a == lVar.f50284a && this.f50285b == lVar.f50285b && this.f50286c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f50287e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f50288f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f50284a;
        long j11 = this.f50285b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50286c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f50287e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return w.f50298a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f50288f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f50284a + ", requestUptimeMs=" + this.f50285b + ", clientInfo=" + this.f50286c + ", logSource=" + this.d + ", logSourceName=" + this.f50287e + ", logEvents=" + this.f50288f + ", qosTier=" + w.f50298a + "}";
    }
}
