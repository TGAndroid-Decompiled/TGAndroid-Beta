package za;
public final class a0 {
    public final String f47860a;
    public final String f47861b;
    public final int f47862c;
    public final long d;

    public a0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f47860a = sessionId;
        this.f47861b = firstSessionId;
        this.f47862c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f47860a, a0Var.f47860a) && kotlin.jvm.internal.i.a(this.f47861b, a0Var.f47861b) && this.f47862c == a0Var.f47862c && this.d == a0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f47860a.hashCode() * 31, 31, this.f47861b) + this.f47862c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f47860a + ", firstSessionId=" + this.f47861b + ", sessionIndex=" + this.f47862c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
