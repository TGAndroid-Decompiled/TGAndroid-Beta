package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49491b;
    public final e9.m f49492c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f49491b = obj;
        this.f49492c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f49491b;
    }

    @Override
    public final Object getValue() {
        return this.f49492c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
