package za;
public final class a0 {
    public final String f54275a;
    public final String f54276b;
    public final int f54277c;
    public final long d;

    public a0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54275a = sessionId;
        this.f54276b = firstSessionId;
        this.f54277c = i10;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (kotlin.jvm.internal.i.a(this.f54275a, a0Var.f54275a) && kotlin.jvm.internal.i.a(this.f54276b, a0Var.f54276b) && this.f54277c == a0Var.f54277c && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a1.g.h(this.f54275a.hashCode() * 31, 31, this.f54276b) + this.f54277c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f54275a + ", firstSessionId=" + this.f54276b + ", sessionIndex=" + this.f54277c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
