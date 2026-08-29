package z6;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f50697a;

    public a0(w wVar) {
        this.f50697a = wVar;
    }

    @Override
    public final w a() {
        return this.f50697a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f50697a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f50697a.equals(((a0) obj).f50697a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f50697a.hashCode();
    }

    public final String toString() {
        return this.f50697a.toString().concat(".reverse()");
    }
}
