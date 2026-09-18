package za;
public final class z {
    public final String f49096a;
    public final String f49097b;
    public final int f49098c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49096a = sessionId;
        this.f49097b = firstSessionId;
        this.f49098c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49096a, zVar.f49096a) && kotlin.jvm.internal.i.a(this.f49097b, zVar.f49097b) && this.f49098c == zVar.f49098c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49096a.hashCode() * 31, 31, this.f49097b) + this.f49098c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49096a + ", firstSessionId=" + this.f49097b + ", sessionIndex=" + this.f49098c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
