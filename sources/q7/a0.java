package q7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f53973a;

    public a0(w wVar) {
        this.f53973a = wVar;
    }

    @Override
    public final w a() {
        return this.f53973a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f53973a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f53973a.equals(((a0) obj).f53973a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f53973a.hashCode();
    }

    public final String toString() {
        return this.f53973a.toString().concat(".reverse()");
    }
}
