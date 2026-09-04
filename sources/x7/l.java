package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49064b;
    public final e9.l f49065c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f49064b = obj;
        this.f49065c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f49064b;
    }

    @Override
    public final Object getValue() {
        return this.f49065c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
