package org.telegram.ui;

import android.content.Context;
public final class t00 extends org.telegram.ui.Components.e00 {
    public final int Q;
    public final Object R;

    public t00(Object obj, Context context, int i9) {
        super(context, null);
        this.Q = i9;
        this.R = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.Q) {
            case 0:
                return ((f10) this.R).f38105s;
            default:
                return ((d10) this.R).d.f38105s;
        }
    }
}
