package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class yc extends RadialProgressView {
    public final int O;
    public final Object P;

    public yc(org.telegram.ui.Components.w30 w30Var, Context context, int i7) {
        super(context, null);
        this.O = i7;
        this.P = w30Var;
    }

    @Override
    public void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                qq0 qq0Var = ((PhotoViewer) this.P).f43253f0;
                if (qq0Var != null) {
                    qq0Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void setAlpha(float f10) {
        switch (this.O) {
            case 0:
                super.setAlpha(f10);
                ((ad) this.P).h.invalidate();
                return;
            case 1:
                super.setAlpha(f10);
                ((f50) this.P).f47596e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((pc0) this.P).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                qq0 qq0Var = ((PhotoViewer) this.P).f43253f0;
                if (qq0Var != null) {
                    qq0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public yc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.h6 h6Var) {
        super(contextThemeWrapper, h6Var);
        this.O = 3;
        this.P = photoViewer;
    }
}
