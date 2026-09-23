package za;
public final class n {
    public final String f48761a;

    public n(String str) {
        this.f48761a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f48761a, ((n) obj).f48761a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f48761a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f48761a + ')';
    }
}
