package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f51261b;
    public final e9.m f51262c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f51261b = obj;
        this.f51262c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f51261b;
    }

    @Override
    public final Object getValue() {
        return this.f51262c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
