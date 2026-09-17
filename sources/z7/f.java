package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f50849b;
    public final e9.l f50850c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f50849b = obj;
        this.f50850c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f50849b;
    }

    @Override
    public final Object getValue() {
        return this.f50850c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
