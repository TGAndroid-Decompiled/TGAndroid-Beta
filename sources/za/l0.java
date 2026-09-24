package za;
public final class l0 {
    public final String f49072a;
    public final String f49073b;
    public final int f49074c;
    public final long d;
    public final j e;
    public final String f49075f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49072a = sessionId;
        this.f49073b = firstSessionId;
        this.f49074c = i10;
        this.d = j3;
        this.e = jVar;
        this.f49075f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f49072a, l0Var.f49072a) && kotlin.jvm.internal.i.a(this.f49073b, l0Var.f49073b) && this.f49074c == l0Var.f49074c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.e, l0Var.e) && kotlin.jvm.internal.i.a(this.f49075f, l0Var.f49075f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f49075f.hashCode() + ((hashCode + ((((a4.a.h(this.f49072a.hashCode() * 31, 31, this.f49073b) + this.f49074c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f49072a + ", firstSessionId=" + this.f49073b + ", sessionIndex=" + this.f49074c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f49075f + ')';
    }
}
