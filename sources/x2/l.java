package x2;

import java.util.ArrayList;
public final class l extends s {
    public final long f46758a;
    public final long f46759b;
    public final j f46760c;
    public final Integer d;
    public final String e;
    public final ArrayList f46761f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f46771a;
        this.f46758a = j10;
        this.f46759b = j11;
        this.f46760c = jVar;
        this.d = num;
        this.e = str;
        this.f46761f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f46771a;
                ArrayList arrayList = lVar.f46761f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f46760c;
                if (this.f46758a == lVar.f46758a && this.f46759b == lVar.f46759b && this.f46760c.equals(jVar)) {
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
                    if (this.f46761f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f46758a;
        long j11 = this.f46759b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f46760c.hashCode()) * 1000003;
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
        return w.f46771a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f46761f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f46758a + ", requestUptimeMs=" + this.f46759b + ", clientInfo=" + this.f46760c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f46761f + ", qosTier=" + w.f46771a + "}";
    }
}
