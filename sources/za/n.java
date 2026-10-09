package za;
public final class n {
    public final String f54271a;

    public n(String str) {
        this.f54271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f54271a, ((n) obj).f54271a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f54271a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f54271a + ')';
    }
}
