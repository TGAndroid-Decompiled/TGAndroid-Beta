package org.telegram.ui;

import android.util.FloatProperty;
public final class vr0 extends FloatProperty {
    public vr0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((xu0) obj).f45858a);
    }

    public final void setValue(Object obj, float f7) {
        ((xu0) obj).b(f7);
    }
}
