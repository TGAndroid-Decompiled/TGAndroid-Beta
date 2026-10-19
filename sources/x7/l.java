package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49445b;
    public final e9.m f49446c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f49445b = obj;
        this.f49446c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f49445b;
    }

    @Override
    public final Object getValue() {
        return this.f49446c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
