package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f51262b;
    public final e9.m f51263c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f51262b = obj;
        this.f51263c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f51262b;
    }

    @Override
    public final Object getValue() {
        return this.f51263c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
