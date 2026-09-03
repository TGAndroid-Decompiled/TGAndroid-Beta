package org.telegram.ui;

import android.util.FloatProperty;
public final class tr0 extends FloatProperty {
    public tr0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((xu0) obj).f40073a);
    }

    @Override
    public final void setValue(Object obj, float f10) {
        ((xu0) obj).b(f10);
    }
}
