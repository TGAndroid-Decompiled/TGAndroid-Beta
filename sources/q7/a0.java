package q7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f53869a;

    public a0(w wVar) {
        this.f53869a = wVar;
    }

    @Override
    public final w a() {
        return this.f53869a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f53869a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f53869a.equals(((a0) obj).f53869a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f53869a.hashCode();
    }

    public final String toString() {
        return this.f53869a.toString().concat(".reverse()");
    }
}
