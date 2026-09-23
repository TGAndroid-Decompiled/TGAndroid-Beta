package za;
public final class l0 {
    public final String f48755a;
    public final String f48756b;
    public final int f48757c;
    public final long d;
    public final j e;
    public final String f48758f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48755a = sessionId;
        this.f48756b = firstSessionId;
        this.f48757c = i10;
        this.d = j3;
        this.e = jVar;
        this.f48758f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f48755a, l0Var.f48755a) && kotlin.jvm.internal.i.a(this.f48756b, l0Var.f48756b) && this.f48757c == l0Var.f48757c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.e, l0Var.e) && kotlin.jvm.internal.i.a(this.f48758f, l0Var.f48758f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f48758f.hashCode() + ((hashCode + ((((a4.a.h(this.f48755a.hashCode() * 31, 31, this.f48756b) + this.f48757c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f48755a + ", firstSessionId=" + this.f48756b + ", sessionIndex=" + this.f48757c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f48758f + ')';
    }
}
