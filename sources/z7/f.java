package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f53776b;
    public final e9.l f53777c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f53776b = obj;
        this.f53777c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f53776b;
    }

    @Override
    public final Object getValue() {
        return this.f53777c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
