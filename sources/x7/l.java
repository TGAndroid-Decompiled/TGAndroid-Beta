package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f45511b;
    public final e9.l f45512c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f45511b = obj;
        this.f45512c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f45511b;
    }

    @Override
    public final Object getValue() {
        return this.f45512c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
