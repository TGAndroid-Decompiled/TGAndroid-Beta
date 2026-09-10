package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f44828b;
    public final e9.l f44829c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f44828b = obj;
        this.f44829c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f44828b;
    }

    @Override
    public final Object getValue() {
        return this.f44829c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
