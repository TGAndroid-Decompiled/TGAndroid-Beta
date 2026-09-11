package za;
public final class m {
    public final String f51461a;

    public m(String str) {
        this.f51461a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f51461a, ((m) obj).f51461a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f51461a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f51461a + ')';
    }
}
