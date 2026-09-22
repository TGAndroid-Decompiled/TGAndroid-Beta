package za;
public final class j0 {
    public final String f49121a;
    public final String f49122b;
    public final int f49123c;
    public final long d;
    public final j e;
    public final String f49124f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49121a = sessionId;
        this.f49122b = firstSessionId;
        this.f49123c = i10;
        this.d = j3;
        this.e = jVar;
        this.f49124f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f49121a, j0Var.f49121a) && kotlin.jvm.internal.i.a(this.f49122b, j0Var.f49122b) && this.f49123c == j0Var.f49123c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.e, j0Var.e) && kotlin.jvm.internal.i.a(this.f49124f, j0Var.f49124f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f49124f.hashCode() + ((hashCode + ((((a4.a.h(this.f49121a.hashCode() * 31, 31, this.f49122b) + this.f49123c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f49121a + ", firstSessionId=" + this.f49122b + ", sessionIndex=" + this.f49123c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f49124f + ')';
    }
}
