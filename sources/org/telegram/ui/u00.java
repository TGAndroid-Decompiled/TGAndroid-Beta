package org.telegram.ui;

import android.content.Context;
public final class u00 extends org.telegram.ui.Components.c10 {
    public final int U;
    public final Object V;

    public u00(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((h10) this.V).f39849s;
            default:
                return ((f10) this.V).d.f39849s;
        }
    }
}
