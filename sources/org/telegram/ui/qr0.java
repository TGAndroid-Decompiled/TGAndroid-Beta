package org.telegram.ui;

import android.util.FloatProperty;
public final class qr0 extends FloatProperty {
    public qr0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((su0) obj).f41488a);
    }

    public final void setValue(Object obj, float f7) {
        ((su0) obj).b(f7);
    }
}
