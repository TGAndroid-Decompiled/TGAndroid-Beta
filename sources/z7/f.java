package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f52520b;
    public final e9.l f52521c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f52520b = obj;
        this.f52521c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f52520b;
    }

    @Override
    public final Object getValue() {
        return this.f52521c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
