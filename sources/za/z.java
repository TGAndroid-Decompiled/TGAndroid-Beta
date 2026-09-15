package za;
public final class z {
    public final String f48842a;
    public final String f48843b;
    public final int f48844c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48842a = sessionId;
        this.f48843b = firstSessionId;
        this.f48844c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f48842a, zVar.f48842a) && kotlin.jvm.internal.i.a(this.f48843b, zVar.f48843b) && this.f48844c == zVar.f48844c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f48842a.hashCode() * 31, 31, this.f48843b) + this.f48844c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f48842a + ", firstSessionId=" + this.f48843b + ", sessionIndex=" + this.f48844c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
