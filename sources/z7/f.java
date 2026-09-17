package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f50880b;
    public final e9.l f50881c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f50880b = obj;
        this.f50881c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f50880b;
    }

    @Override
    public final Object getValue() {
        return this.f50881c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
