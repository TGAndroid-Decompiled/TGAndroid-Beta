package za;
public final class m {
    public final String f49067a;

    public m(String str) {
        this.f49067a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f49067a, ((m) obj).f49067a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f49067a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f49067a + ')';
    }
}
