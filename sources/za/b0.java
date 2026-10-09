package za;
public final class b0 {
    public final String f54191a;
    public final String f54192b;
    public final int f54193c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54191a = sessionId;
        this.f54192b = firstSessionId;
        this.f54193c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f54191a, b0Var.f54191a) && kotlin.jvm.internal.i.a(this.f54192b, b0Var.f54192b) && this.f54193c == b0Var.f54193c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a1.g.h(this.f54191a.hashCode() * 31, 31, this.f54192b) + this.f54193c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f54191a + ", firstSessionId=" + this.f54192b + ", sessionIndex=" + this.f54193c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
