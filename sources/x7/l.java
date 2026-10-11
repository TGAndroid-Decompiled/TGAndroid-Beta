package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f50961b;
    public final e9.l f50962c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f50961b = obj;
        this.f50962c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f50961b;
    }

    @Override
    public final Object getValue() {
        return this.f50962c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
