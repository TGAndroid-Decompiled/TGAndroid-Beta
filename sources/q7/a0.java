package q7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f55410a;

    public a0(w wVar) {
        this.f55410a = wVar;
    }

    @Override
    public final w a() {
        return this.f55410a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f55410a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f55410a.equals(((a0) obj).f55410a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f55410a.hashCode();
    }

    public final String toString() {
        return this.f55410a.toString().concat(".reverse()");
    }
}
