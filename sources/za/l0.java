package za;
public final class l0 {
    public final String f54262a;
    public final String f54263b;
    public final int f54264c;
    public final long d;
    public final j f54265e;
    public final String f54266f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54262a = sessionId;
        this.f54263b = firstSessionId;
        this.f54264c = i10;
        this.d = j3;
        this.f54265e = jVar;
        this.f54266f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f54262a, l0Var.f54262a) && kotlin.jvm.internal.i.a(this.f54263b, l0Var.f54263b) && this.f54264c == l0Var.f54264c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.f54265e, l0Var.f54265e) && kotlin.jvm.internal.i.a(this.f54266f, l0Var.f54266f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f54265e.hashCode();
        return this.f54266f.hashCode() + ((hashCode + ((((a1.g.h(this.f54262a.hashCode() * 31, 31, this.f54263b) + this.f54264c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f54262a + ", firstSessionId=" + this.f54263b + ", sessionIndex=" + this.f54264c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f54265e + ", firebaseInstallationId=" + this.f54266f + ')';
    }
}
