package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f50832b;
    public final e9.m f50833c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f50832b = obj;
        this.f50833c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f50832b;
    }

    @Override
    public final Object getValue() {
        return this.f50833c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
