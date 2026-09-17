package za;
public final class m {
    public final String f51493a;

    public m(String str) {
        this.f51493a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f51493a, ((m) obj).f51493a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f51493a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f51493a + ')';
    }
}
