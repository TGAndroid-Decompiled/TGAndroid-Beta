package p7;

import java.io.Serializable;
public final class b0 extends x implements Serializable {
    public final x f53342a;

    public b0(x xVar) {
        this.f53342a = xVar;
    }

    @Override
    public final x a() {
        return this.f53342a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f53342a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f53342a.equals(((b0) obj).f53342a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f53342a.hashCode();
    }

    public final String toString() {
        return this.f53342a.toString().concat(".reverse()");
    }
}
