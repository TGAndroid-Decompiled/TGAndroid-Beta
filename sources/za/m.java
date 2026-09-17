package za;
public final class m {
    public final String f51462a;

    public m(String str) {
        this.f51462a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f51462a, ((m) obj).f51462a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f51462a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f51462a + ')';
    }
}
