package yd;
public final class j {
    public static final i f59409b = new Object();
    public final Object f59410a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!kotlin.jvm.internal.j.a(this.f59410a, ((j) obj).f59410a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f59410a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f59410a;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
