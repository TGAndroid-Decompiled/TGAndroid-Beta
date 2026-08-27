package pc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

public final class d implements Serializable {

    public final Object f45688a;

    public final Object f45689b;

    public d(Object obj, Object obj2) {
        this.f45688a = obj;
        this.f45689b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f45688a, dVar.f45688a) && j.a(this.f45689b, dVar.f45689b);
    }

    public final int hashCode() {
        Object obj = this.f45688a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f45689b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f45688a + ", " + this.f45689b + ')';
    }
}
