package x6;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f49007a;

    public f(Object obj) {
        this.f49007a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f49007a, ((f) obj).f49007a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49007a});
    }

    public final String toString() {
        return aa.d.o("Suppliers.ofInstance(", this.f49007a.toString(), ")");
    }
}
