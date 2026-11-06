package q7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f53879a;

    public f(Object obj) {
        this.f53879a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f53879a, ((f) obj).f53879a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53879a});
    }

    public final String toString() {
        return a8.p0.p("Suppliers.ofInstance(", this.f53879a.toString(), ")");
    }
}
