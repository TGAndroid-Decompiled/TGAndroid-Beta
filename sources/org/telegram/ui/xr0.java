package org.telegram.ui;

import android.util.FloatProperty;
public final class xr0 extends FloatProperty {
    public xr0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((zu0) obj).f46365a);
    }

    public final void setValue(Object obj, float f7) {
        ((zu0) obj).b(f7);
    }
}
