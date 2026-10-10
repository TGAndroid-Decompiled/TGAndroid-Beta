package za;
public final class l0 {
    public final String f54308a;
    public final String f54309b;
    public final int f54310c;
    public final long d;
    public final j f54311e;
    public final String f54312f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54308a = sessionId;
        this.f54309b = firstSessionId;
        this.f54310c = i10;
        this.d = j3;
        this.f54311e = jVar;
        this.f54312f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f54308a, l0Var.f54308a) && kotlin.jvm.internal.i.a(this.f54309b, l0Var.f54309b) && this.f54310c == l0Var.f54310c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.f54311e, l0Var.f54311e) && kotlin.jvm.internal.i.a(this.f54312f, l0Var.f54312f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f54311e.hashCode();
        return this.f54312f.hashCode() + ((hashCode + ((((a1.g.h(this.f54308a.hashCode() * 31, 31, this.f54309b) + this.f54310c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f54308a + ", firstSessionId=" + this.f54309b + ", sessionIndex=" + this.f54310c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f54311e + ", firebaseInstallationId=" + this.f54312f + ')';
    }
}
