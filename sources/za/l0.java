package za;
public final class l0 {
    public final String f49083a;
    public final String f49084b;
    public final int f49085c;
    public final long d;
    public final j e;
    public final String f49086f;

    public l0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49083a = sessionId;
        this.f49084b = firstSessionId;
        this.f49085c = i10;
        this.d = j3;
        this.e = jVar;
        this.f49086f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.i.a(this.f49083a, l0Var.f49083a) && kotlin.jvm.internal.i.a(this.f49084b, l0Var.f49084b) && this.f49085c == l0Var.f49085c && this.d == l0Var.d && kotlin.jvm.internal.i.a(this.e, l0Var.e) && kotlin.jvm.internal.i.a(this.f49086f, l0Var.f49086f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f49086f.hashCode() + ((hashCode + ((((a4.a.h(this.f49083a.hashCode() * 31, 31, this.f49084b) + this.f49085c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f49083a + ", firstSessionId=" + this.f49084b + ", sessionIndex=" + this.f49085c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f49086f + ')';
    }
}
