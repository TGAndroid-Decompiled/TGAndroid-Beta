package za;
public final class z {
    public final String f53169a;
    public final String f53170b;
    public final int f53171c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f53169a = sessionId;
        this.f53170b = firstSessionId;
        this.f53171c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f53169a, zVar.f53169a) && kotlin.jvm.internal.i.a(this.f53170b, zVar.f53170b) && this.f53171c == zVar.f53171c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f53169a.hashCode() * 31, 31, this.f53170b) + this.f53171c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f53169a + ", firstSessionId=" + this.f53170b + ", sessionIndex=" + this.f53171c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
