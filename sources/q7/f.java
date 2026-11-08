package q7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f53972a;

    public f(Object obj) {
        this.f53972a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f53972a, ((f) obj).f53972a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53972a});
    }

    public final String toString() {
        return a8.p0.p("Suppliers.ofInstance(", this.f53972a.toString(), ")");
    }
}
