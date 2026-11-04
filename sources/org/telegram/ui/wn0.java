package org.telegram.ui;

import android.util.FloatProperty;
public final class wn0 extends FloatProperty {
    public wn0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((sq0) obj).f49592a);
    }

    public final void setValue(Object obj, float f10) {
        ((sq0) obj).b(f10);
    }
}
