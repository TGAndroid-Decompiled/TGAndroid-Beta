package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f45768b;
    public final e9.l f45769c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f45768b = obj;
        this.f45769c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f45768b;
    }

    @Override
    public final Object getValue() {
        return this.f45769c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
