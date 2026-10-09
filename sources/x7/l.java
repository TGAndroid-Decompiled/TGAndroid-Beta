package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f50839b;
    public final e9.l f50840c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f50839b = obj;
        this.f50840c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f50839b;
    }

    @Override
    public final Object getValue() {
        return this.f50840c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
