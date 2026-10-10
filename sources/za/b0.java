package za;
public final class b0 {
    public final String f54237a;
    public final String f54238b;
    public final int f54239c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54237a = sessionId;
        this.f54238b = firstSessionId;
        this.f54239c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f54237a, b0Var.f54237a) && kotlin.jvm.internal.i.a(this.f54238b, b0Var.f54238b) && this.f54239c == b0Var.f54239c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a1.g.h(this.f54237a.hashCode() * 31, 31, this.f54238b) + this.f54239c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f54237a + ", firstSessionId=" + this.f54238b + ", sessionIndex=" + this.f54239c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
