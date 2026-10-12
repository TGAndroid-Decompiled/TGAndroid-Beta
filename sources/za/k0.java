package za;
public final class k0 {
    public final String f54482a;
    public final String f54483b;
    public final int f54484c;
    public final long d;
    public final j f54485e;
    public final String f54486f;

    public k0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54482a = sessionId;
        this.f54483b = firstSessionId;
        this.f54484c = i10;
        this.d = j3;
        this.f54485e = jVar;
        this.f54486f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.i.a(this.f54482a, k0Var.f54482a) && kotlin.jvm.internal.i.a(this.f54483b, k0Var.f54483b) && this.f54484c == k0Var.f54484c && this.d == k0Var.d && kotlin.jvm.internal.i.a(this.f54485e, k0Var.f54485e) && kotlin.jvm.internal.i.a(this.f54486f, k0Var.f54486f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f54485e.hashCode();
        return this.f54486f.hashCode() + ((hashCode + ((((a1.g.h(this.f54482a.hashCode() * 31, 31, this.f54483b) + this.f54484c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f54482a + ", firstSessionId=" + this.f54483b + ", sessionIndex=" + this.f54484c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f54485e + ", firebaseInstallationId=" + this.f54486f + ')';
    }
}
