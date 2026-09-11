package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f50848b;
    public final e9.l f50849c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f50848b = obj;
        this.f50849c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f50848b;
    }

    @Override
    public final Object getValue() {
        return this.f50849c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
