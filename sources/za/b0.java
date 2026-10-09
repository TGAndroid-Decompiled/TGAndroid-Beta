package za;
public final class b0 {
    public final String f54193a;
    public final String f54194b;
    public final int f54195c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54193a = sessionId;
        this.f54194b = firstSessionId;
        this.f54195c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f54193a, b0Var.f54193a) && kotlin.jvm.internal.i.a(this.f54194b, b0Var.f54194b) && this.f54195c == b0Var.f54195c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a1.g.h(this.f54193a.hashCode() * 31, 31, this.f54194b) + this.f54195c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f54193a + ", firstSessionId=" + this.f54194b + ", sessionIndex=" + this.f54195c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
