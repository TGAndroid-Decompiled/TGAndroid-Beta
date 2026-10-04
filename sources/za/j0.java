package za;
public final class j0 {
    public final String f53126a;
    public final String f53127b;
    public final int f53128c;
    public final long d;
    public final j f53129e;
    public final String f53130f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f53126a = sessionId;
        this.f53127b = firstSessionId;
        this.f53128c = i10;
        this.d = j3;
        this.f53129e = jVar;
        this.f53130f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f53126a, j0Var.f53126a) && kotlin.jvm.internal.i.a(this.f53127b, j0Var.f53127b) && this.f53128c == j0Var.f53128c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.f53129e, j0Var.f53129e) && kotlin.jvm.internal.i.a(this.f53130f, j0Var.f53130f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f53129e.hashCode();
        return this.f53130f.hashCode() + ((hashCode + ((((a4.a.h(this.f53126a.hashCode() * 31, 31, this.f53127b) + this.f53128c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f53126a + ", firstSessionId=" + this.f53127b + ", sessionIndex=" + this.f53128c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f53129e + ", firebaseInstallationId=" + this.f53130f + ')';
    }
}
