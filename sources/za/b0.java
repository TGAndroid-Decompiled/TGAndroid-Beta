package za;
public final class b0 {
    public final String f49128a;
    public final String f49129b;
    public final int f49130c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49128a = sessionId;
        this.f49129b = firstSessionId;
        this.f49130c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49128a, b0Var.f49128a) && kotlin.jvm.internal.i.a(this.f49129b, b0Var.f49129b) && this.f49130c == b0Var.f49130c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49128a.hashCode() * 31, 31, this.f49129b) + this.f49130c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49128a + ", firstSessionId=" + this.f49129b + ", sessionIndex=" + this.f49130c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
