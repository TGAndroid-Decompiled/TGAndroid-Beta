package za;
public final class m {
    public final String f49133a;

    public m(String str) {
        this.f49133a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f49133a, ((m) obj).f49133a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f49133a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f49133a + ')';
    }
}
