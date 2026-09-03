package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class e implements Serializable {
    public final Throwable f44312a;

    public e(Throwable exception) {
        j.e(exception, "exception");
        this.f44312a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (j.a(this.f44312a, ((e) obj).f44312a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44312a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f44312a + ')';
    }
}
