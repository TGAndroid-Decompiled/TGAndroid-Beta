package x2;

import java.util.ArrayList;
public final class l extends s {
    public final long f50321a;
    public final long f50322b;
    public final j f50323c;
    public final Integer d;
    public final String f50324e;
    public final ArrayList f50325f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f50335a;
        this.f50321a = j10;
        this.f50322b = j11;
        this.f50323c = jVar;
        this.d = num;
        this.f50324e = str;
        this.f50325f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f50335a;
                ArrayList arrayList = lVar.f50325f;
                String str = lVar.f50324e;
                Integer num = lVar.d;
                j jVar = lVar.f50323c;
                if (this.f50321a == lVar.f50321a && this.f50322b == lVar.f50322b && this.f50323c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f50324e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f50325f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f50321a;
        long j11 = this.f50322b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50323c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f50324e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return w.f50335a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f50325f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f50321a + ", requestUptimeMs=" + this.f50322b + ", clientInfo=" + this.f50323c + ", logSource=" + this.d + ", logSourceName=" + this.f50324e + ", logEvents=" + this.f50325f + ", qosTier=" + w.f50335a + "}";
    }
}
