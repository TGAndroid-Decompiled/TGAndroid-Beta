package q7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f56029a;

    public a0(w wVar) {
        this.f56029a = wVar;
    }

    @Override
    public final w a() {
        return this.f56029a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f56029a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f56029a.equals(((a0) obj).f56029a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f56029a.hashCode();
    }

    public final String toString() {
        return this.f56029a.toString().concat(".reverse()");
    }
}
