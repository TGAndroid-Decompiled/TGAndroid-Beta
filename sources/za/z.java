package za;
public final class z {
    public final String f48865a;
    public final String f48866b;
    public final int f48867c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48865a = sessionId;
        this.f48866b = firstSessionId;
        this.f48867c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f48865a, zVar.f48865a) && kotlin.jvm.internal.i.a(this.f48866b, zVar.f48866b) && this.f48867c == zVar.f48867c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f48865a.hashCode() * 31, 31, this.f48866b) + this.f48867c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f48865a + ", firstSessionId=" + this.f48866b + ", sessionIndex=" + this.f48867c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
