package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class uw {
    public final int f42531a;
    public final vw f42532b;
    public final View f42533c;

    public uw(vw vwVar, View view, int i10) {
        this.f42531a = i10;
        this.f42532b = vwVar;
        this.f42533c = view;
    }

    public final void a(boolean z10) {
        switch (this.f42531a) {
            case 0:
                View view = this.f42533c;
                if (view instanceof ci.q) {
                    this.f42532b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f42533c;
                if (view2 instanceof ci.q) {
                    this.f42532b.O0.E0.i((ci.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
