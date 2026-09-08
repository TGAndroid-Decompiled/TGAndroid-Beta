package za;
public final class j0 {
    public final String f51479a;
    public final String f51480b;
    public final int f51481c;
    public final long d;
    public final j f51482e;
    public final String f51483f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f51479a = sessionId;
        this.f51480b = firstSessionId;
        this.f51481c = i10;
        this.d = j3;
        this.f51482e = jVar;
        this.f51483f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f51479a, j0Var.f51479a) && kotlin.jvm.internal.i.a(this.f51480b, j0Var.f51480b) && this.f51481c == j0Var.f51481c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.f51482e, j0Var.f51482e) && kotlin.jvm.internal.i.a(this.f51483f, j0Var.f51483f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f51482e.hashCode();
        return this.f51483f.hashCode() + ((hashCode + ((((a4.a.h(this.f51479a.hashCode() * 31, 31, this.f51480b) + this.f51481c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f51479a + ", firstSessionId=" + this.f51480b + ", sessionIndex=" + this.f51481c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f51482e + ", firebaseInstallationId=" + this.f51483f + ')';
    }
}
