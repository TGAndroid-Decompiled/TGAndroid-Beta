package y6;

import java.io.Serializable;
import java.util.Arrays;

public final class f implements Serializable {

    public final Object f49724a;

    public f(Object obj) {
        this.f49724a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f49724a, ((f) obj).f49724a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49724a});
    }

    public final String toString() {
        return a9.p.m("Suppliers.ofInstance(", this.f49724a.toString(), ")");
    }
}
