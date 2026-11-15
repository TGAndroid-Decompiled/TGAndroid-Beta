package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class yc extends RadialProgressView {
    public final int O;
    public final Object P;

    public yc(org.telegram.ui.Components.l30 l30Var, Context context, int i7) {
        super(context, null);
        this.O = i7;
        this.P = l30Var;
    }

    @Override
    public void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                oq0 oq0Var = ((PhotoViewer) this.P).f42763f0;
                if (oq0Var != null) {
                    oq0Var.invalidate();
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
                ((c50) this.P).f46020e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((oc0) this.P).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                oq0 oq0Var = ((PhotoViewer) this.P).f42763f0;
                if (oq0Var != null) {
                    oq0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public yc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper, e6Var);
        this.O = 3;
        this.P = photoViewer;
    }
}
