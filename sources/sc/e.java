package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class e implements Serializable {
    public final Throwable f47268a;

    public e(Throwable exception) {
        j.e(exception, "exception");
        this.f47268a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (j.a(this.f47268a, ((e) obj).f47268a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47268a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f47268a + ')';
    }
}
