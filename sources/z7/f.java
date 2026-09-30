package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f48615b;
    public final e9.l f48616c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f48615b = obj;
        this.f48616c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f48615b;
    }

    @Override
    public final Object getValue() {
        return this.f48616c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
