package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f54708b;
    public final e9.m f54709c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f54708b = obj;
        this.f54709c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f54708b;
    }

    @Override
    public final Object getValue() {
        return this.f54709c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
