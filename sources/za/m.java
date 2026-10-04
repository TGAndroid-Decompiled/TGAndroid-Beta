package za;
public final class m {
    public final String f53139a;

    public m(String str) {
        this.f53139a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f53139a, ((m) obj).f53139a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f53139a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f53139a + ')';
    }
}
