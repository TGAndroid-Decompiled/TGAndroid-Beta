package za;
public final class b0 {
    public final String f49020a;
    public final String f49021b;
    public final int f49022c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49020a = sessionId;
        this.f49021b = firstSessionId;
        this.f49022c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49020a, b0Var.f49020a) && kotlin.jvm.internal.i.a(this.f49021b, b0Var.f49021b) && this.f49022c == b0Var.f49022c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49020a.hashCode() * 31, 31, this.f49021b) + this.f49022c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49020a + ", firstSessionId=" + this.f49021b + ", sessionIndex=" + this.f49022c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
