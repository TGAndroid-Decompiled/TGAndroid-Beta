package q7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f55420a;

    public f(Object obj) {
        this.f55420a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f55420a, ((f) obj).f55420a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55420a});
    }

    public final String toString() {
        return a8.p0.p("Suppliers.ofInstance(", this.f55420a.toString(), ")");
    }
}
