package org.telegram.ui;

import android.content.Context;
public final class v00 extends org.telegram.ui.Components.p00 {
    public final int Q;
    public final Object R;

    public v00(Object obj, Context context, int i10) {
        super(context, null);
        this.Q = i10;
        this.R = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.Q) {
            case 0:
                return ((h10) this.R).f38738s;
            default:
                return ((f10) this.R).d.f38738s;
        }
    }
}
