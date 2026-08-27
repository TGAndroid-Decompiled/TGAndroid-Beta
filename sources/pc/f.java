package pc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

public final class f implements Serializable {

    public final Object f45691a;

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f45690a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return j.a(this.f45691a, ((f) obj).f45691a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f45691a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f45691a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
