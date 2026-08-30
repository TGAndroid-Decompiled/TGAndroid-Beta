package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class d implements Serializable {
    public final Object f44245a;
    public final Object f44246b;

    public d(Object obj, Object obj2) {
        this.f44245a = obj;
        this.f44246b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.f44245a, dVar.f44245a) && j.a(this.f44246b, dVar.f44246b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f44245a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f44246b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f44245a + ", " + this.f44246b + ')';
    }
}
