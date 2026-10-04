package za;
public final class m {
    public final String f53134a;

    public m(String str) {
        this.f53134a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f53134a, ((m) obj).f53134a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f53134a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f53134a + ')';
    }
}
