package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f49405b;
    public final e9.m f49406c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f49405b = obj;
        this.f49406c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f49405b;
    }

    @Override
    public final Object getValue() {
        return this.f49406c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
