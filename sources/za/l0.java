package za;
public final class l0 {
    public final String f49085a;
    public final String f49086b;
    public final int f49087c;
    public final long d;
    public final j e;
    public final String f49088f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49085a = sessionId;
        this.f49086b = firstSessionId;
        this.f49087c = i10;
        this.d = j3;
        this.e = jVar;
        this.f49088f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f49085a, l0Var.f49085a) && kotlin.jvm.internal.i.a(this.f49086b, l0Var.f49086b) && this.f49087c == l0Var.f49087c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.e, l0Var.e) && kotlin.jvm.internal.i.a(this.f49088f, l0Var.f49088f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f49088f.hashCode() + ((hashCode + ((((a4.a.h(this.f49085a.hashCode() * 31, 31, this.f49086b) + this.f49087c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f49085a + ", firstSessionId=" + this.f49086b + ", sessionIndex=" + this.f49087c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f49088f + ')';
    }
}
