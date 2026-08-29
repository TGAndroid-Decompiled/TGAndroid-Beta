package x2;

import java.util.ArrayList;
public final class l extends s {
    public final long f50034a;
    public final long f50035b;
    public final j f50036c;
    public final Integer d;
    public final String f50037e;
    public final ArrayList f50038f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f50048a;
        this.f50034a = j10;
        this.f50035b = j11;
        this.f50036c = jVar;
        this.d = num;
        this.f50037e = str;
        this.f50038f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f50048a;
                ArrayList arrayList = lVar.f50038f;
                String str = lVar.f50037e;
                Integer num = lVar.d;
                j jVar = lVar.f50036c;
                if (this.f50034a == lVar.f50034a && this.f50035b == lVar.f50035b && this.f50036c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f50037e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f50038f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f50034a;
        long j11 = this.f50035b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50036c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f50037e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return w.f50048a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f50038f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f50034a + ", requestUptimeMs=" + this.f50035b + ", clientInfo=" + this.f50036c + ", logSource=" + this.d + ", logSourceName=" + this.f50037e + ", logEvents=" + this.f50038f + ", qosTier=" + w.f50048a + "}";
    }
}
