package za;
public final class b0 {
    public final String f49021a;
    public final String f49022b;
    public final int f49023c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49021a = sessionId;
        this.f49022b = firstSessionId;
        this.f49023c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49021a, b0Var.f49021a) && kotlin.jvm.internal.i.a(this.f49022b, b0Var.f49022b) && this.f49023c == b0Var.f49023c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49021a.hashCode() * 31, 31, this.f49022b) + this.f49023c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49021a + ", firstSessionId=" + this.f49022b + ", sessionIndex=" + this.f49023c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
