package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f45786b;
    public final e9.l f45787c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f45786b = obj;
        this.f45787c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f45786b;
    }

    @Override
    public final Object getValue() {
        return this.f45787c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
