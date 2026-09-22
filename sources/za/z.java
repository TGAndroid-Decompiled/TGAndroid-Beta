package za;
public final class z {
    public final String f48835a;
    public final String f48836b;
    public final int f48837c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48835a = sessionId;
        this.f48836b = firstSessionId;
        this.f48837c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f48835a, zVar.f48835a) && kotlin.jvm.internal.i.a(this.f48836b, zVar.f48836b) && this.f48837c == zVar.f48837c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f48835a.hashCode() * 31, 31, this.f48836b) + this.f48837c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f48835a + ", firstSessionId=" + this.f48836b + ", sessionIndex=" + this.f48837c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
