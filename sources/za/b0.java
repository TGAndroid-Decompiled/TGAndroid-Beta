package za;
public final class b0 {
    public final String f49022a;
    public final String f49023b;
    public final int f49024c;
    public final long d;

    public b0(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49022a = sessionId;
        this.f49023b = firstSessionId;
        this.f49024c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49022a, b0Var.f49022a) && kotlin.jvm.internal.i.a(this.f49023b, b0Var.f49023b) && this.f49024c == b0Var.f49024c && this.d == b0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49022a.hashCode() * 31, 31, this.f49023b) + this.f49024c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49022a + ", firstSessionId=" + this.f49023b + ", sessionIndex=" + this.f49024c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
