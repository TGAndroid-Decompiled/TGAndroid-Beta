package org.telegram.ui;

import android.content.Context;
public final class qz extends org.telegram.ui.Components.yz {
    public final int V;
    public final Object W;

    public qz(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.V) {
            case 0:
                return ((c00) this.W).f46370s;
            default:
                return ((a00) this.W).d.f46370s;
        }
    }
}
