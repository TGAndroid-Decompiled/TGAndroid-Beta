package za;
public final class m {
    public final String f48841a;

    public m(String str) {
        this.f48841a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f48841a, ((m) obj).f48841a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f48841a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f48841a + ')';
    }
}
