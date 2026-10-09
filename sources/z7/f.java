package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f53651b;
    public final e9.l f53652c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f53651b = obj;
        this.f53652c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f53651b;
    }

    @Override
    public final Object getValue() {
        return this.f53652c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
