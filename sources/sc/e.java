package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class e implements Serializable {
    public final Throwable f47237a;

    public e(Throwable exception) {
        j.e(exception, "exception");
        this.f47237a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (j.a(this.f47237a, ((e) obj).f47237a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47237a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f47237a + ')';
    }
}
