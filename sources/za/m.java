package za;
public final class m {
    public final String f49129a;

    public m(String str) {
        this.f49129a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f49129a, ((m) obj).f49129a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f49129a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f49129a + ')';
    }
}
