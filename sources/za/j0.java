package za;
public final class j0 {
    public final String f48801a;
    public final String f48802b;
    public final int f48803c;
    public final long d;
    public final j e;
    public final String f48804f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48801a = sessionId;
        this.f48802b = firstSessionId;
        this.f48803c = i10;
        this.d = j3;
        this.e = jVar;
        this.f48804f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f48801a, j0Var.f48801a) && kotlin.jvm.internal.i.a(this.f48802b, j0Var.f48802b) && this.f48803c == j0Var.f48803c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.e, j0Var.e) && kotlin.jvm.internal.i.a(this.f48804f, j0Var.f48804f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f48804f.hashCode() + ((hashCode + ((((a4.a.h(this.f48801a.hashCode() * 31, 31, this.f48802b) + this.f48803c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f48801a + ", firstSessionId=" + this.f48802b + ", sessionIndex=" + this.f48803c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f48804f + ')';
    }
}
