package za;
public final class o {
    public final String f49201a;

    public o(String str) {
        this.f49201a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && kotlin.jvm.internal.i.a(this.f49201a, ((o) obj).f49201a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f49201a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f49201a + ')';
    }
}
