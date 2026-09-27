package za;
public final class z {
    public final String f49158a;
    public final String f49159b;
    public final int f49160c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49158a = sessionId;
        this.f49159b = firstSessionId;
        this.f49160c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49158a, zVar.f49158a) && kotlin.jvm.internal.i.a(this.f49159b, zVar.f49159b) && this.f49160c == zVar.f49160c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49158a.hashCode() * 31, 31, this.f49159b) + this.f49160c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49158a + ", firstSessionId=" + this.f49159b + ", sessionIndex=" + this.f49160c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
