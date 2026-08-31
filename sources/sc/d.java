package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class d implements Serializable {
    public final Object f47235a;
    public final Object f47236b;

    public d(Object obj, Object obj2) {
        this.f47235a = obj;
        this.f47236b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.f47235a, dVar.f47235a) && j.a(this.f47236b, dVar.f47236b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f47235a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f47236b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f47235a + ", " + this.f47236b + ')';
    }
}
