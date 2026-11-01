package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f54726b;
    public final e9.m f54727c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f54726b = obj;
        this.f54727c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f54726b;
    }

    @Override
    public final Object getValue() {
        return this.f54727c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
