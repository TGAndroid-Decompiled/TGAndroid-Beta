package za;
public final class z {
    public final String f51491a;
    public final String f51492b;
    public final int f51493c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f51491a = sessionId;
        this.f51492b = firstSessionId;
        this.f51493c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f51491a, zVar.f51491a) && kotlin.jvm.internal.i.a(this.f51492b, zVar.f51492b) && this.f51493c == zVar.f51493c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f51491a.hashCode() * 31, 31, this.f51492b) + this.f51493c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f51491a + ", firstSessionId=" + this.f51492b + ", sessionIndex=" + this.f51493c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
