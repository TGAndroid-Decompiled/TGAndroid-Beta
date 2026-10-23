package org.telegram.ui;

import android.util.FloatProperty;
public final class rr0 extends FloatProperty {
    public rr0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((tu0) obj).f42076a);
    }

    public final void setValue(Object obj, float f7) {
        ((tu0) obj).b(f7);
    }
}
