package za;
public final class k0 {
    public final String f54345a;
    public final String f54346b;
    public final int f54347c;
    public final long d;
    public final j f54348e;
    public final String f54349f;

    public k0(String sessionId, String firstSessionId, int i10, long j3, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54345a = sessionId;
        this.f54346b = firstSessionId;
        this.f54347c = i10;
        this.d = j3;
        this.f54348e = jVar;
        this.f54349f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.i.a(this.f54345a, k0Var.f54345a) && kotlin.jvm.internal.i.a(this.f54346b, k0Var.f54346b) && this.f54347c == k0Var.f54347c && this.d == k0Var.d && kotlin.jvm.internal.i.a(this.f54348e, k0Var.f54348e) && kotlin.jvm.internal.i.a(this.f54349f, k0Var.f54349f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        int hashCode = this.f54348e.hashCode();
        return this.f54349f.hashCode() + ((hashCode + ((((a1.g.h(this.f54345a.hashCode() * 31, 31, this.f54346b) + this.f54347c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f54345a + ", firstSessionId=" + this.f54346b + ", sessionIndex=" + this.f54347c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.f54348e + ", firebaseInstallationId=" + this.f54349f + ')';
    }
}
