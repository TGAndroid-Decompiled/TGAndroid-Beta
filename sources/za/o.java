package za;
public final class o {
    public final String f49082a;

    public o(String str) {
        this.f49082a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && kotlin.jvm.internal.i.a(this.f49082a, ((o) obj).f49082a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f49082a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f49082a + ')';
    }
}
