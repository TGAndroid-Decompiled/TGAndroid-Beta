package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class d implements Serializable {
    public final Object f44310a;
    public final Object f44311b;

    public d(Object obj, Object obj2) {
        this.f44310a = obj;
        this.f44311b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.f44310a, dVar.f44310a) && j.a(this.f44311b, dVar.f44311b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f44310a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f44311b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f44310a + ", " + this.f44311b + ')';
    }
}
