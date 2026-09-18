package za;
public final class j0 {
    public final String f49055a;
    public final String f49056b;
    public final int f49057c;
    public final long d;
    public final j e;
    public final String f49058f;

    public j0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49055a = sessionId;
        this.f49056b = firstSessionId;
        this.f49057c = i10;
        this.d = j3;
        this.e = jVar;
        this.f49058f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.i.a(this.f49055a, j0Var.f49055a) && kotlin.jvm.internal.i.a(this.f49056b, j0Var.f49056b) && this.f49057c == j0Var.f49057c && this.d == j0Var.d && kotlin.jvm.internal.i.a(this.e, j0Var.e) && kotlin.jvm.internal.i.a(this.f49058f, j0Var.f49058f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f49058f.hashCode() + ((hashCode + ((((a4.a.h(this.f49055a.hashCode() * 31, 31, this.f49056b) + this.f49057c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f49055a + ", firstSessionId=" + this.f49056b + ", sessionIndex=" + this.f49057c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f49058f + ')';
    }
}
