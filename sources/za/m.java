package za;
public final class m {
    public final String f53160a;

    public m(String str) {
        this.f53160a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f53160a, ((m) obj).f53160a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f53160a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f53160a + ')';
    }
}
