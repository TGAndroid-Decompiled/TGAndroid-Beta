package za;
public final class l0 {
    public final String f54264a;
    public final String f54265b;
    public final int f54266c;
    public final long d;
    public final j f54267e;
    public final String f54268f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54264a = sessionId;
        this.f54265b = firstSessionId;
        this.f54266c = i10;
        this.d = j3;
        this.f54267e = jVar;
        this.f54268f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f54264a, l0Var.f54264a) && kotlin.jvm.internal.i.a(this.f54265b, l0Var.f54265b) && this.f54266c == l0Var.f54266c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.f54267e, l0Var.f54267e) && kotlin.jvm.internal.i.a(this.f54268f, l0Var.f54268f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f54267e.hashCode();
        return this.f54268f.hashCode() + ((hashCode + ((((a1.g.h(this.f54264a.hashCode() * 31, 31, this.f54265b) + this.f54266c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f54264a + ", firstSessionId=" + this.f54265b + ", sessionIndex=" + this.f54266c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f54267e + ", firebaseInstallationId=" + this.f54268f + ')';
    }
}
