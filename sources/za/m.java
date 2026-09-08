package za;
public final class m {
    public final String f51492a;

    public m(String str) {
        this.f51492a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f51492a, ((m) obj).f51492a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f51492a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f51492a + ')';
    }
}
