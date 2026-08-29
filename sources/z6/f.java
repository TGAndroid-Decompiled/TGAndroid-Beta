package z6;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f50707a;

    public f(Object obj) {
        this.f50707a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f50707a, ((f) obj).f50707a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50707a});
    }

    public final String toString() {
        return a4.w.n("Suppliers.ofInstance(", this.f50707a.toString(), ")");
    }
}
