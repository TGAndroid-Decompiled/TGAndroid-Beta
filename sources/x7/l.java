package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49065b;
    public final e9.l f49066c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f49065b = obj;
        this.f49066c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f49065b;
    }

    @Override
    public final Object getValue() {
        return this.f49066c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
