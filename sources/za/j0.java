package za;
public final class j0 {
    public final String f53121a;
    public final String f53122b;
    public final int f53123c;
    public final long d;
    public final j f53124e;
    public final String f53125f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f53121a = sessionId;
        this.f53122b = firstSessionId;
        this.f53123c = i10;
        this.d = j3;
        this.f53124e = jVar;
        this.f53125f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f53121a, j0Var.f53121a) && kotlin.jvm.internal.i.a(this.f53122b, j0Var.f53122b) && this.f53123c == j0Var.f53123c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.f53124e, j0Var.f53124e) && kotlin.jvm.internal.i.a(this.f53125f, j0Var.f53125f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f53124e.hashCode();
        return this.f53125f.hashCode() + ((hashCode + ((((a4.a.h(this.f53121a.hashCode() * 31, 31, this.f53122b) + this.f53123c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f53121a + ", firstSessionId=" + this.f53122b + ", sessionIndex=" + this.f53123c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f53124e + ", firebaseInstallationId=" + this.f53125f + ')';
    }
}
