package za;
public final class k0 {
    public final String f54490a;
    public final String f54491b;
    public final int f54492c;
    public final long d;
    public final j f54493e;
    public final String f54494f;

    public k0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54490a = sessionId;
        this.f54491b = firstSessionId;
        this.f54492c = i10;
        this.d = j3;
        this.f54493e = jVar;
        this.f54494f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.i.a(this.f54490a, k0Var.f54490a) && kotlin.jvm.internal.i.a(this.f54491b, k0Var.f54491b) && this.f54492c == k0Var.f54492c && this.d == k0Var.d && kotlin.jvm.internal.i.a(this.f54493e, k0Var.f54493e) && kotlin.jvm.internal.i.a(this.f54494f, k0Var.f54494f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f54493e.hashCode();
        return this.f54494f.hashCode() + ((hashCode + ((((a1.g.h(this.f54490a.hashCode() * 31, 31, this.f54491b) + this.f54492c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f54490a + ", firstSessionId=" + this.f54491b + ", sessionIndex=" + this.f54492c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f54493e + ", firebaseInstallationId=" + this.f54494f + ')';
    }
}
