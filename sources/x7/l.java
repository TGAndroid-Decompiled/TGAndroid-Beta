package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f53243b;
    public final e9.m f53244c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f53243b = obj;
        this.f53244c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f53243b;
    }

    @Override
    public final Object getValue() {
        return this.f53244c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
