package za;
public final class b0 {
    public final String f49019a;
    public final String f49020b;
    public final int f49021c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49019a = sessionId;
        this.f49020b = firstSessionId;
        this.f49021c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49019a, b0Var.f49019a) && kotlin.jvm.internal.i.a(this.f49020b, b0Var.f49020b) && this.f49021c == b0Var.f49021c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49019a.hashCode() * 31, 31, this.f49020b) + this.f49021c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49019a + ", firstSessionId=" + this.f49020b + ", sessionIndex=" + this.f49021c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
