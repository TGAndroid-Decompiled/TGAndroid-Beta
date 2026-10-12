package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f51068b;
    public final e9.l f51069c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f51068b = obj;
        this.f51069c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f51068b;
    }

    @Override
    public final Object getValue() {
        return this.f51069c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
