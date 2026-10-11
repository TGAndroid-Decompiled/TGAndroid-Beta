package za;
public final class k0 {
    public final String f54379a;
    public final String f54380b;
    public final int f54381c;
    public final long d;
    public final j f54382e;
    public final String f54383f;

    public k0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54379a = sessionId;
        this.f54380b = firstSessionId;
        this.f54381c = i10;
        this.d = j3;
        this.f54382e = jVar;
        this.f54383f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.i.a(this.f54379a, k0Var.f54379a) && kotlin.jvm.internal.i.a(this.f54380b, k0Var.f54380b) && this.f54381c == k0Var.f54381c && this.d == k0Var.d && kotlin.jvm.internal.i.a(this.f54382e, k0Var.f54382e) && kotlin.jvm.internal.i.a(this.f54383f, k0Var.f54383f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f54382e.hashCode();
        return this.f54383f.hashCode() + ((hashCode + ((((a1.g.h(this.f54379a.hashCode() * 31, 31, this.f54380b) + this.f54381c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f54379a + ", firstSessionId=" + this.f54380b + ", sessionIndex=" + this.f54381c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f54382e + ", firebaseInstallationId=" + this.f54383f + ')';
    }
}
