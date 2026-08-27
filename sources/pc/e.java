package pc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

public final class e implements Serializable {

    public final Throwable f45690a;

    public e(Throwable exception) {
        j.e(exception, "exception");
        this.f45690a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f45690a, ((e) obj).f45690a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45690a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f45690a + ')';
    }
}
