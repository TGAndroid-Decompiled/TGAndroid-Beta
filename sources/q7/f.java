package q7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f53984a;

    public f(Object obj) {
        this.f53984a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f53984a, ((f) obj).f53984a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53984a});
    }

    public final String toString() {
        return a8.p0.p("Suppliers.ofInstance(", this.f53984a.toString(), ")");
    }
}
