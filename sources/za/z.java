package za;
public final class z {
    public final String f51523a;
    public final String f51524b;
    public final int f51525c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f51523a = sessionId;
        this.f51524b = firstSessionId;
        this.f51525c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f51523a, zVar.f51523a) && kotlin.jvm.internal.i.a(this.f51524b, zVar.f51524b) && this.f51525c == zVar.f51525c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f51523a.hashCode() * 31, 31, this.f51524b) + this.f51525c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f51523a + ", firstSessionId=" + this.f51524b + ", sessionIndex=" + this.f51525c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
