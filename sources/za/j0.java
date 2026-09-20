package za;
public final class j0 {
    public final String f49101a;
    public final String f49102b;
    public final int f49103c;
    public final long d;
    public final j e;
    public final String f49104f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49101a = sessionId;
        this.f49102b = firstSessionId;
        this.f49103c = i10;
        this.d = j3;
        this.e = jVar;
        this.f49104f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f49101a, j0Var.f49101a) && kotlin.jvm.internal.i.a(this.f49102b, j0Var.f49102b) && this.f49103c == j0Var.f49103c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.e, j0Var.e) && kotlin.jvm.internal.i.a(this.f49104f, j0Var.f49104f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f49104f.hashCode() + ((hashCode + ((((a4.a.h(this.f49101a.hashCode() * 31, 31, this.f49102b) + this.f49103c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f49101a + ", firstSessionId=" + this.f49102b + ", sessionIndex=" + this.f49103c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f49104f + ')';
    }
}
