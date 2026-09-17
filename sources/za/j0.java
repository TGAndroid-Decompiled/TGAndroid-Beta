package za;
public final class j0 {
    public final String f51449a;
    public final String f51450b;
    public final int f51451c;
    public final long d;
    public final j f51452e;
    public final String f51453f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f51449a = sessionId;
        this.f51450b = firstSessionId;
        this.f51451c = i10;
        this.d = j3;
        this.f51452e = jVar;
        this.f51453f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f51449a, j0Var.f51449a) && kotlin.jvm.internal.i.a(this.f51450b, j0Var.f51450b) && this.f51451c == j0Var.f51451c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.f51452e, j0Var.f51452e) && kotlin.jvm.internal.i.a(this.f51453f, j0Var.f51453f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f51452e.hashCode();
        return this.f51453f.hashCode() + ((hashCode + ((((a4.a.h(this.f51449a.hashCode() * 31, 31, this.f51450b) + this.f51451c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f51449a + ", firstSessionId=" + this.f51450b + ", sessionIndex=" + this.f51451c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f51452e + ", firebaseInstallationId=" + this.f51453f + ')';
    }
}
