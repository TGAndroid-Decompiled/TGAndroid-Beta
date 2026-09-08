package za;
public final class z {
    public final String f51522a;
    public final String f51523b;
    public final int f51524c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f51522a = sessionId;
        this.f51523b = firstSessionId;
        this.f51524c = i10;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (kotlin.jvm.internal.i.a(this.f51522a, zVar.f51522a) && kotlin.jvm.internal.i.a(this.f51523b, zVar.f51523b) && this.f51524c == zVar.f51524c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f51522a.hashCode() * 31, 31, this.f51523b) + this.f51524c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f51522a + ", firstSessionId=" + this.f51523b + ", sessionIndex=" + this.f51524c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
