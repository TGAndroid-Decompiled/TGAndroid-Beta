package za;
public final class z {
    public final String f49162a;
    public final String f49163b;
    public final int f49164c;
    public final long d;

    public z(int i10, long j3, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f49162a = sessionId;
        this.f49163b = firstSessionId;
        this.f49164c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f49162a, zVar.f49162a) && kotlin.jvm.internal.i.a(this.f49163b, zVar.f49163b) && this.f49164c == zVar.f49164c && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((a4.a.h(this.f49162a.hashCode() * 31, 31, this.f49163b) + this.f49164c) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f49162a + ", firstSessionId=" + this.f49163b + ", sessionIndex=" + this.f49164c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
