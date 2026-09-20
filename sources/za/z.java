package za;
public final class z {
    public final String f49142a;
    public final String f49143b;
    public final int f49144c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49142a = sessionId;
        this.f49143b = firstSessionId;
        this.f49144c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49142a, zVar.f49142a) && kotlin.jvm.internal.i.a(this.f49143b, zVar.f49143b) && this.f49144c == zVar.f49144c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49142a.hashCode() * 31, 31, this.f49143b) + this.f49144c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49142a + ", firstSessionId=" + this.f49143b + ", sessionIndex=" + this.f49144c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
