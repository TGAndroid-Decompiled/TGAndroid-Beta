package q7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f56035a;

    public f(Object obj) {
        this.f56035a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f56035a, ((f) obj).f56035a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56035a});
    }

    public final String toString() {
        return a8.p0.p("Suppliers.ofInstance(", this.f56035a.toString(), ")");
    }
}
