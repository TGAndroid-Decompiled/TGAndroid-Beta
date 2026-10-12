package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f53887b;
    public final e9.l f53888c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f53887b = obj;
        this.f53888c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f53887b;
    }

    @Override
    public final Object getValue() {
        return this.f53888c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
