package org.telegram.ui;

import android.content.Context;

public final class w00 extends org.telegram.ui.Components.h00 {
    public final int Q;
    public final Object R;

    public w00(Object obj, Context context, int i10) {
        super(context, null);
        this.Q = i10;
        this.R = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.Q) {
            case 0:
                return ((i10) this.R).f38954s;
            default:
                return ((g10) this.R).d.f38954s;
        }
    }
}
