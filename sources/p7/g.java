package p7;

import java.io.Serializable;
import java.util.Arrays;
public final class g implements Serializable {
    public final Object f53354a;

    public g(Object obj) {
        this.f53354a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return a.h(this.f53354a, ((g) obj).f53354a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53354a});
    }

    public final String toString() {
        return a1.g.q("Suppliers.ofInstance(", this.f53354a.toString(), ")");
    }
}
