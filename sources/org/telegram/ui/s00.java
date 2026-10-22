package org.telegram.ui;

import android.content.Context;
public final class s00 extends org.telegram.ui.Components.b10 {
    public final int U;
    public final Object V;

    public s00(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((e10) this.V).f36518s;
            default:
                return ((c10) this.V).d.f36518s;
        }
    }
}
