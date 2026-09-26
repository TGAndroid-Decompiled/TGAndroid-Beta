package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f45765b;
    public final e9.l f45766c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f45765b = obj;
        this.f45766c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f45765b;
    }

    @Override
    public final Object getValue() {
        return this.f45766c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
