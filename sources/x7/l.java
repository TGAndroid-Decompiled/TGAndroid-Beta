package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f45767b;
    public final e9.l f45768c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f45767b = obj;
        this.f45768c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f45767b;
    }

    @Override
    public final Object getValue() {
        return this.f45768c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
