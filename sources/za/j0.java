package za;
public final class j0 {
    public final String f48824a;
    public final String f48825b;
    public final int f48826c;
    public final long d;
    public final j e;
    public final String f48827f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48824a = sessionId;
        this.f48825b = firstSessionId;
        this.f48826c = i10;
        this.d = j3;
        this.e = jVar;
        this.f48827f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f48824a, j0Var.f48824a) && kotlin.jvm.internal.i.a(this.f48825b, j0Var.f48825b) && this.f48826c == j0Var.f48826c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.e, j0Var.e) && kotlin.jvm.internal.i.a(this.f48827f, j0Var.f48827f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f48827f.hashCode() + ((hashCode + ((((a4.a.h(this.f48824a.hashCode() * 31, 31, this.f48825b) + this.f48826c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f48824a + ", firstSessionId=" + this.f48825b + ", sessionIndex=" + this.f48826c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f48827f + ')';
    }
}
