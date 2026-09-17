package za;
public final class j0 {
    public final String f51480a;
    public final String f51481b;
    public final int f51482c;
    public final long d;
    public final j f51483e;
    public final String f51484f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f51480a = sessionId;
        this.f51481b = firstSessionId;
        this.f51482c = i10;
        this.d = j3;
        this.f51483e = jVar;
        this.f51484f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f51480a, j0Var.f51480a) && kotlin.jvm.internal.i.a(this.f51481b, j0Var.f51481b) && this.f51482c == j0Var.f51482c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.f51483e, j0Var.f51483e) && kotlin.jvm.internal.i.a(this.f51484f, j0Var.f51484f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f51483e.hashCode();
        return this.f51484f.hashCode() + ((hashCode + ((((a4.a.h(this.f51480a.hashCode() * 31, 31, this.f51481b) + this.f51482c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f51480a + ", firstSessionId=" + this.f51481b + ", sessionIndex=" + this.f51482c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f51483e + ", firebaseInstallationId=" + this.f51484f + ')';
    }
}
