package q7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f56117a;

    public f(Object obj) {
        this.f56117a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f56117a, ((f) obj).f56117a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56117a});
    }

    public final String toString() {
        return a8.p0.p("Suppliers.ofInstance(", this.f56117a.toString(), ")");
    }
}
