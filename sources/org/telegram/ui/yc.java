package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class yc extends RadialProgressView {
    public final int O;
    public final Object P;

    public yc(org.telegram.ui.Components.e30 e30Var, Context context, int i3) {
        super(context, null);
        this.O = i3;
        this.P = e30Var;
    }

    @Override
    public void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                gq0 gq0Var = ((PhotoViewer) this.P).f41420f0;
                if (gq0Var != null) {
                    gq0Var.invalidate();
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
                ((y40) this.P).f52183e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((nc0) this.P).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                gq0 gq0Var = ((PhotoViewer) this.P).f41420f0;
                if (gq0Var != null) {
                    gq0Var.invalidate();
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
