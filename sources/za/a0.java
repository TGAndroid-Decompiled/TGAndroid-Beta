package za;
public final class a0 {
    public final String f54309a;
    public final String f54310b;
    public final int f54311c;
    public final long d;

    public a0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54309a = sessionId;
        this.f54310b = firstSessionId;
        this.f54311c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f54309a, a0Var.f54309a) && kotlin.jvm.internal.i.a(this.f54310b, a0Var.f54310b) && this.f54311c == a0Var.f54311c && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a1.g.h(this.f54309a.hashCode() * 31, 31, this.f54310b) + this.f54311c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f54309a + ", firstSessionId=" + this.f54310b + ", sessionIndex=" + this.f54311c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
