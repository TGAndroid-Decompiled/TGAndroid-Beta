package za;
public final class a0 {
    public final String f54420a;
    public final String f54421b;
    public final int f54422c;
    public final long d;

    public a0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54420a = sessionId;
        this.f54421b = firstSessionId;
        this.f54422c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f54420a, a0Var.f54420a) && kotlin.jvm.internal.i.a(this.f54421b, a0Var.f54421b) && this.f54422c == a0Var.f54422c && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a1.g.h(this.f54420a.hashCode() * 31, 31, this.f54421b) + this.f54422c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f54420a + ", firstSessionId=" + this.f54421b + ", sessionIndex=" + this.f54422c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
