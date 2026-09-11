package za;
public final class j0 {
    public final String f51448a;
    public final String f51449b;
    public final int f51450c;
    public final long d;
    public final j f51451e;
    public final String f51452f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f51448a = sessionId;
        this.f51449b = firstSessionId;
        this.f51450c = i10;
        this.d = j3;
        this.f51451e = jVar;
        this.f51452f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f51448a, j0Var.f51448a) && kotlin.jvm.internal.i.a(this.f51449b, j0Var.f51449b) && this.f51450c == j0Var.f51450c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.f51451e, j0Var.f51451e) && kotlin.jvm.internal.i.a(this.f51452f, j0Var.f51452f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f51451e.hashCode();
        return this.f51452f.hashCode() + ((hashCode + ((((a4.a.h(this.f51448a.hashCode() * 31, 31, this.f51449b) + this.f51450c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f51448a + ", firstSessionId=" + this.f51449b + ", sessionIndex=" + this.f51450c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f51451e + ", firebaseInstallationId=" + this.f51452f + ')';
    }
}
