package za;
public final class m {
    public final String f49113a;

    public m(String str) {
        this.f49113a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.i.a(this.f49113a, ((m) obj).f49113a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f49113a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f49113a + ')';
    }
}
