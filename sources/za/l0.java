package za;
public final class l0 {
    public final String f49191a;
    public final String f49192b;
    public final int f49193c;
    public final long d;
    public final j e;
    public final String f49194f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49191a = sessionId;
        this.f49192b = firstSessionId;
        this.f49193c = i10;
        this.d = j3;
        this.e = jVar;
        this.f49194f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f49191a, l0Var.f49191a) && kotlin.jvm.internal.i.a(this.f49192b, l0Var.f49192b) && this.f49193c == l0Var.f49193c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.e, l0Var.e) && kotlin.jvm.internal.i.a(this.f49194f, l0Var.f49194f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f49194f.hashCode() + ((hashCode + ((((a4.a.h(this.f49191a.hashCode() * 31, 31, this.f49192b) + this.f49193c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f49191a + ", firstSessionId=" + this.f49192b + ", sessionIndex=" + this.f49193c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f49194f + ')';
    }
}
