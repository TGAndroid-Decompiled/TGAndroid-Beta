package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f49407b;
    public final e9.m f49408c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f49407b = obj;
        this.f49408c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f49407b;
    }

    @Override
    public final Object getValue() {
        return this.f49408c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
