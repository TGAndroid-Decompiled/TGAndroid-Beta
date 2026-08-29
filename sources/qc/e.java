package qc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class e implements Serializable {
    public final Throwable f46597a;

    public e(Throwable exception) {
        j.e(exception, "exception");
        this.f46597a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (j.a(this.f46597a, ((e) obj).f46597a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46597a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f46597a + ')';
    }
}
