package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f53697b;
    public final e9.l f53698c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f53697b = obj;
        this.f53698c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f53697b;
    }

    @Override
    public final Object getValue() {
        return this.f53698c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
