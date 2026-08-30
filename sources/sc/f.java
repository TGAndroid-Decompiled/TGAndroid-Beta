package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class f implements Serializable {
    public final Object f44248a;

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f44247a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!j.a(this.f44248a, ((f) obj).f44248a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f44248a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f44248a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
