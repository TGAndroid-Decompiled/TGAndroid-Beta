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
                pq0 pq0Var = ((PhotoViewer) this.O).f41384e0;
                if (pq0Var != null) {
                    pq0Var.invalidate();
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
                ((d50) this.O).f44954e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((pc0) this.O).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                pq0 pq0Var = ((PhotoViewer) this.O).f41384e0;
                if (pq0Var != null) {
                    pq0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public zc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}
