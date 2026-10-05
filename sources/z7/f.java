package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f52547b;
    public final e9.l f52548c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f52547b = obj;
        this.f52548c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f52547b;
    }

    @Override
    public final Object getValue() {
        return this.f52548c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
