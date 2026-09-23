package za;
public final class b0 {
    public final String f48692a;
    public final String f48693b;
    public final int f48694c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48692a = sessionId;
        this.f48693b = firstSessionId;
        this.f48694c = i10;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (kotlin.jvm.internal.i.a(this.f48692a, b0Var.f48692a) && kotlin.jvm.internal.i.a(this.f48693b, b0Var.f48693b) && this.f48694c == b0Var.f48694c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f48692a.hashCode() * 31, 31, this.f48693b) + this.f48694c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f48692a + ", firstSessionId=" + this.f48693b + ", sessionIndex=" + this.f48694c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
