package za;
public final class n {
    public final String f54495a;

    public n(String str) {
        this.f54495a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f54495a, ((n) obj).f54495a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f54495a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f54495a + ')';
    }
}
