package za;
public final class z {
    public final String f53163a;
    public final String f53164b;
    public final int f53165c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f53163a = sessionId;
        this.f53164b = firstSessionId;
        this.f53165c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f53163a, zVar.f53163a) && kotlin.jvm.internal.i.a(this.f53164b, zVar.f53164b) && this.f53165c == zVar.f53165c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f53163a.hashCode() * 31, 31, this.f53164b) + this.f53165c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f53163a + ", firstSessionId=" + this.f53164b + ", sessionIndex=" + this.f53165c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
