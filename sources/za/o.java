package za;
public final class o {
    public final String f49092a;

    public o(String str) {
        this.f49092a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && kotlin.jvm.internal.i.a(this.f49092a, ((o) obj).f49092a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f49092a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f49092a + ')';
    }
}
