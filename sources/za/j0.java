package za;
public final class j0 {
    public final String f48829a;
    public final String f48830b;
    public final int f48831c;
    public final long d;
    public final j e;
    public final String f48832f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48829a = sessionId;
        this.f48830b = firstSessionId;
        this.f48831c = i10;
        this.d = j3;
        this.e = jVar;
        this.f48832f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f48829a, j0Var.f48829a) && kotlin.jvm.internal.i.a(this.f48830b, j0Var.f48830b) && this.f48831c == j0Var.f48831c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.e, j0Var.e) && kotlin.jvm.internal.i.a(this.f48832f, j0Var.f48832f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f48832f.hashCode() + ((hashCode + ((((a4.a.h(this.f48829a.hashCode() * 31, 31, this.f48830b) + this.f48831c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f48829a + ", firstSessionId=" + this.f48830b + ", sessionIndex=" + this.f48831c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f48832f + ')';
    }
}
