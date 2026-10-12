package za;
public final class a0 {
    public final String f54412a;
    public final String f54413b;
    public final int f54414c;
    public final long d;

    public a0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f54412a = sessionId;
        this.f54413b = firstSessionId;
        this.f54414c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f54412a, a0Var.f54412a) && kotlin.jvm.internal.i.a(this.f54413b, a0Var.f54413b) && this.f54414c == a0Var.f54414c && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a1.g.h(this.f54412a.hashCode() * 31, 31, this.f54413b) + this.f54414c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f54412a + ", firstSessionId=" + this.f54413b + ", sessionIndex=" + this.f54414c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
