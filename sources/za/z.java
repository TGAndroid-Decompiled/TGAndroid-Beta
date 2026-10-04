package za;
public final class z {
    public final String f53164a;
    public final String f53165b;
    public final int f53166c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f53164a = sessionId;
        this.f53165b = firstSessionId;
        this.f53166c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f53164a, zVar.f53164a) && kotlin.jvm.internal.i.a(this.f53165b, zVar.f53165b) && this.f53166c == zVar.f53166c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f53164a.hashCode() * 31, 31, this.f53165b) + this.f53166c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f53164a + ", firstSessionId=" + this.f53165b + ", sessionIndex=" + this.f53166c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
