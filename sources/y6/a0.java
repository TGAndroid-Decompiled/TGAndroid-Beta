package y6;

import java.io.Serializable;

public final class a0 extends w implements Serializable {

    public final w f49714a;

    public a0(w wVar) {
        this.f49714a = wVar;
    }

    @Override
    public final w a() {
        return this.f49714a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f49714a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f49714a.equals(((a0) obj).f49714a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f49714a.hashCode();
    }

    public final String toString() {
        return this.f49714a.toString().concat(".reverse()");
    }
}
