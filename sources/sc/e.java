package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class e implements Serializable {
    public final Throwable f44247a;

    public e(Throwable exception) {
        j.e(exception, "exception");
        this.f44247a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (j.a(this.f44247a, ((e) obj).f44247a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44247a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f44247a + ')';
    }
}
