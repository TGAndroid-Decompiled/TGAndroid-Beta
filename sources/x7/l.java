package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f51076b;
    public final e9.l f51077c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f51076b = obj;
        this.f51077c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f51076b;
    }

    @Override
    public final Object getValue() {
        return this.f51077c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
