package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class zc extends RadialProgressView {
    public final int N;
    public final Object O;

    public zc(org.telegram.ui.Components.i30 i30Var, Context context, int i7) {
        super(context, null);
        this.N = i7;
        this.O = i30Var;
    }

    @Override
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                sq0 sq0Var = ((PhotoViewer) this.O).f41382e0;
                if (sq0Var != null) {
                    sq0Var.invalidate();
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
        switch (this.N) {
            case 0:
                super.setAlpha(f10);
                ((bd) this.O).h.invalidate();
                return;
            case 1:
                super.setAlpha(f10);
                ((g50) this.O).f45981e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((sc0) this.O).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                sq0 sq0Var = ((PhotoViewer) this.O).f41382e0;
                if (sq0Var != null) {
                    sq0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public zc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.h6 h6Var) {
        super(contextThemeWrapper, h6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}
