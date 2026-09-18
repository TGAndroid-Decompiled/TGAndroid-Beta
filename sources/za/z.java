package za;
public final class z {
    public final String f48870a;
    public final String f48871b;
    public final int f48872c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f48870a = sessionId;
        this.f48871b = firstSessionId;
        this.f48872c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f48870a, zVar.f48870a) && kotlin.jvm.internal.i.a(this.f48871b, zVar.f48871b) && this.f48872c == zVar.f48872c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f48870a.hashCode() * 31, 31, this.f48871b) + this.f48872c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f48870a + ", firstSessionId=" + this.f48871b + ", sessionIndex=" + this.f48872c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
