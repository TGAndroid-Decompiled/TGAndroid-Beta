package za;
public final class k0 {
    public final String f47924a;
    public final String f47925b;
    public final int f47926c;
    public final long d;
    public final j e;
    public final String f47927f;

    public k0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f47924a = sessionId;
        this.f47925b = firstSessionId;
        this.f47926c = i10;
        this.d = j3;
        this.e = jVar;
        this.f47927f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.i.a(this.f47924a, k0Var.f47924a) && kotlin.jvm.internal.i.a(this.f47925b, k0Var.f47925b) && this.f47926c == k0Var.f47926c && this.d == k0Var.d && kotlin.jvm.internal.i.a(this.e, k0Var.e) && kotlin.jvm.internal.i.a(this.f47927f, k0Var.f47927f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.e.hashCode();
        return this.f47927f.hashCode() + ((hashCode + ((((a4.a.h(this.f47924a.hashCode() * 31, 31, this.f47925b) + this.f47926c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f47924a + ", firstSessionId=" + this.f47925b + ", sessionIndex=" + this.f47926c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f47927f + ')';
    }
}
