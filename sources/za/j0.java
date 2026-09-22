package za;
public final class j0 {
    public final String f48794a;
    public final String f48795b;
    public final int f48796c;
    public final long d;
    public final j e;
    public final String f48797f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48794a = sessionId;
        this.f48795b = firstSessionId;
        this.f48796c = i10;
        this.d = j3;
        this.e = jVar;
        this.f48797f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f48794a, j0Var.f48794a) && kotlin.jvm.internal.i.a(this.f48795b, j0Var.f48795b) && this.f48796c == j0Var.f48796c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.e, j0Var.e) && kotlin.jvm.internal.i.a(this.f48797f, j0Var.f48797f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f48797f.hashCode() + ((hashCode + ((((a4.a.h(this.f48794a.hashCode() * 31, 31, this.f48795b) + this.f48796c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f48794a + ", firstSessionId=" + this.f48795b + ", sessionIndex=" + this.f48796c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f48797f + ')';
    }
}
