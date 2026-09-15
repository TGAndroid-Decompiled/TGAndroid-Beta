package za;
public final class m {
    public final String f48813a;

    public m(String str) {
        this.f48813a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f48813a, ((m) obj).f48813a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f48813a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f48813a + ')';
    }
}
