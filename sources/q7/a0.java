package q7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f53961a;

    public a0(w wVar) {
        this.f53961a = wVar;
    }

    @Override
    public final w a() {
        return this.f53961a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f53961a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f53961a.equals(((a0) obj).f53961a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f53961a.hashCode();
    }

    public final String toString() {
        return this.f53961a.toString().concat(".reverse()");
    }
}
