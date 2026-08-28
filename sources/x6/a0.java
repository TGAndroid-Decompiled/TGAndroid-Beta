package x6;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f48997a;

    public a0(w wVar) {
        this.f48997a = wVar;
    }

    @Override
    public final w a() {
        return this.f48997a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f48997a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f48997a.equals(((a0) obj).f48997a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f48997a.hashCode();
    }

    public final String toString() {
        return this.f48997a.toString().concat(".reverse()");
    }
}
