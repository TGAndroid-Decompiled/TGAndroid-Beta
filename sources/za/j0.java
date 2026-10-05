package za;
public final class j0 {
    public final String f53147a;
    public final String f53148b;
    public final int f53149c;
    public final long d;
    public final j f53150e;
    public final String f53151f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f53147a = sessionId;
        this.f53148b = firstSessionId;
        this.f53149c = i10;
        this.d = j3;
        this.f53150e = jVar;
        this.f53151f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f53147a, j0Var.f53147a) && kotlin.jvm.internal.i.a(this.f53148b, j0Var.f53148b) && this.f53149c == j0Var.f53149c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.f53150e, j0Var.f53150e) && kotlin.jvm.internal.i.a(this.f53151f, j0Var.f53151f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f53150e.hashCode();
        return this.f53151f.hashCode() + ((hashCode + ((((a4.a.h(this.f53147a.hashCode() * 31, 31, this.f53148b) + this.f53149c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f53147a + ", firstSessionId=" + this.f53148b + ", sessionIndex=" + this.f53149c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f53150e + ", firebaseInstallationId=" + this.f53151f + ')';
    }
}
