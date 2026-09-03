package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class d implements Serializable {
    public final Object f47266a;
    public final Object f47267b;

    public d(Object obj, Object obj2) {
        this.f47266a = obj;
        this.f47267b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.f47266a, dVar.f47266a) && j.a(this.f47267b, dVar.f47267b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f47266a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f47267b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f47266a + ", " + this.f47267b + ')';
    }
}
