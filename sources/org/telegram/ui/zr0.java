package org.telegram.ui;

import android.util.FloatProperty;
public final class zr0 extends FloatProperty {
    public zr0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((cv0) obj).f32802a);
    }

    @Override
    public final void setValue(Object obj, float f7) {
        ((cv0) obj).b(f7);
    }
}
