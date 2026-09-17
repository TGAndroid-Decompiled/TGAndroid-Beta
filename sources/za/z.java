package za;
public final class z {
    public final String f51492a;
    public final String f51493b;
    public final int f51494c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f51492a = sessionId;
        this.f51493b = firstSessionId;
        this.f51494c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f51492a, zVar.f51492a) && kotlin.jvm.internal.i.a(this.f51493b, zVar.f51493b) && this.f51494c == zVar.f51494c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f51492a.hashCode() * 31, 31, this.f51493b) + this.f51494c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f51492a + ", firstSessionId=" + this.f51493b + ", sessionIndex=" + this.f51494c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
