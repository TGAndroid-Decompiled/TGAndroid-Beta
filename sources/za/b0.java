package za;
public final class b0 {
    public final String f49009a;
    public final String f49010b;
    public final int f49011c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49009a = sessionId;
        this.f49010b = firstSessionId;
        this.f49011c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49009a, b0Var.f49009a) && kotlin.jvm.internal.i.a(this.f49010b, b0Var.f49010b) && this.f49011c == b0Var.f49011c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49009a.hashCode() * 31, 31, this.f49010b) + this.f49011c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49009a + ", firstSessionId=" + this.f49010b + ", sessionIndex=" + this.f49011c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
