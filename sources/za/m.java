package za;
public final class m {
    public final String f47930a;

    public m(String str) {
        this.f47930a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f47930a, ((m) obj).f47930a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f47930a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f47930a + ')';
    }
}
