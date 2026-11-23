package q7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f56039a;

    public f(Object obj) {
        this.f56039a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f56039a, ((f) obj).f56039a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56039a});
    }

    public final String toString() {
        return a8.p0.p("Suppliers.ofInstance(", this.f56039a.toString(), ")");
    }
}
