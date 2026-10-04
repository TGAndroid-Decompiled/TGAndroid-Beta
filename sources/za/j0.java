package za;
public final class j0 {
    public final String f53120a;
    public final String f53121b;
    public final int f53122c;
    public final long d;
    public final j f53123e;
    public final String f53124f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f53120a = sessionId;
        this.f53121b = firstSessionId;
        this.f53122c = i10;
        this.d = j3;
        this.f53123e = jVar;
        this.f53124f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f53120a, j0Var.f53120a) && kotlin.jvm.internal.i.a(this.f53121b, j0Var.f53121b) && this.f53122c == j0Var.f53122c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.f53123e, j0Var.f53123e) && kotlin.jvm.internal.i.a(this.f53124f, j0Var.f53124f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f53123e.hashCode();
        return this.f53124f.hashCode() + ((hashCode + ((((a4.a.h(this.f53120a.hashCode() * 31, 31, this.f53121b) + this.f53122c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f53120a + ", firstSessionId=" + this.f53121b + ", sessionIndex=" + this.f53122c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f53123e + ", firebaseInstallationId=" + this.f53124f + ')';
    }
}
