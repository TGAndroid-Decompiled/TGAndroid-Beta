package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f45812b;
    public final e9.l f45813c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f45812b = obj;
        this.f45813c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f45812b;
    }

    @Override
    public final Object getValue() {
        return this.f45813c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
