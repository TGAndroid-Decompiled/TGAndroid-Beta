package v2;

import java.util.ArrayList;

public final class l extends s {

    public final long f48723a;

    public final long f48724b;

    public final j f48725c;
    public final Integer d;

    public final String f48726e;

    public final ArrayList f48727f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f48737a;
        this.f48723a = j10;
        this.f48724b = j11;
        this.f48725c = jVar;
        this.d = num;
        this.f48726e = str;
        this.f48727f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f48737a;
        ArrayList arrayList = lVar.f48727f;
        String str = lVar.f48726e;
        Integer num = lVar.d;
        j jVar = lVar.f48725c;
        if (this.f48723a != lVar.f48723a || this.f48724b != lVar.f48724b || !this.f48725c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f48726e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f48727f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j10 = this.f48723a;
        long j11 = this.f48724b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f48725c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f48726e;
        return w.f48737a.hashCode() ^ ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f48727f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f48723a + ", requestUptimeMs=" + this.f48724b + ", clientInfo=" + this.f48725c + ", logSource=" + this.d + ", logSourceName=" + this.f48726e + ", logEvents=" + this.f48727f + ", qosTier=" + w.f48737a + "}";
    }
}
