package za;
public final class l0 {
    public final String f49084a;
    public final String f49085b;
    public final int f49086c;
    public final long d;
    public final j e;
    public final String f49087f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49084a = sessionId;
        this.f49085b = firstSessionId;
        this.f49086c = i10;
        this.d = j3;
        this.e = jVar;
        this.f49087f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f49084a, l0Var.f49084a) && kotlin.jvm.internal.i.a(this.f49085b, l0Var.f49085b) && this.f49086c == l0Var.f49086c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.e, l0Var.e) && kotlin.jvm.internal.i.a(this.f49087f, l0Var.f49087f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f49087f.hashCode() + ((hashCode + ((((a4.a.h(this.f49084a.hashCode() * 31, 31, this.f49085b) + this.f49086c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f49084a + ", firstSessionId=" + this.f49085b + ", sessionIndex=" + this.f49086c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f49087f + ')';
    }
}
