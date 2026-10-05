package za;
public final class z {
    public final String f53190a;
    public final String f53191b;
    public final int f53192c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f53190a = sessionId;
        this.f53191b = firstSessionId;
        this.f53192c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f53190a, zVar.f53190a) && kotlin.jvm.internal.i.a(this.f53191b, zVar.f53191b) && this.f53192c == zVar.f53192c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f53190a.hashCode() * 31, 31, this.f53191b) + this.f53192c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f53190a + ", firstSessionId=" + this.f53191b + ", sessionIndex=" + this.f53192c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
