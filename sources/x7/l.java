package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f45752b;
    public final e9.l f45753c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f45752b = obj;
        this.f45753c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f45752b;
    }

    @Override
    public final Object getValue() {
        return this.f45753c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
