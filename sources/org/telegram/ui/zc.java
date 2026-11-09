package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class zc extends RadialProgressView {
    public final int N;
    public final Object O;

    public zc(org.telegram.ui.Components.j30 j30Var, Context context, int i7) {
        super(context, null);
        this.N = i7;
        this.O = j30Var;
    }

    @Override
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                rq0 rq0Var = ((PhotoViewer) this.O).f41391e0;
                if (rq0Var != null) {
                    rq0Var.invalidate();
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
                ((f50) this.O).f45587e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((rc0) this.O).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                rq0 rq0Var = ((PhotoViewer) this.O).f41391e0;
                if (rq0Var != null) {
                    rq0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public zc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper, g6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}
