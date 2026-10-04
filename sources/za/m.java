package za;
public final class m {
    public final String f53133a;

    public m(String str) {
        this.f53133a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f53133a, ((m) obj).f53133a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f53133a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f53133a + ')';
    }
}
