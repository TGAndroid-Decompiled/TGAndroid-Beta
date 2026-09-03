package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class f implements Serializable {
    public final Object f47269a;

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f47268a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!j.a(this.f47269a, ((f) obj).f47269a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f47269a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f47269a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
